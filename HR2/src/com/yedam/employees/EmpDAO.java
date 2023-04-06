package com.yedam.employees;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO extends DAO{
	
	// java -> JDBC -> DB -> Employees Table에 접근
	// Employees 조회, 추가, 수정, 삭제(CRUD)
	
	//SinglTon
	private static EmpDAO empDao = null;
	
	private EmpDAO() {
		
	}
	
	public static EmpDAO getInstance() {
		if(empDao == null) {
			empDao = new EmpDAO();
		}
		return empDao;
	}
	
	//CRUD
	
	//1.전체조회
	// SELECT * FROM employess;
	// EmpDTO객체 1 = 1개 row
	// list => EmpDTO 객체를 담아서 사용 => 전체 row를 조회
	
	public List<EmpDTO> getEmployeesList(){
		// list, set, map
		// list -> 순서
		
		List<EmpDTO> list = new ArrayList<>();
		// list[0] -> 첫번째 row
		// list[1] -> 두번째 row
		EmpDTO emp = null;
		
		try {
			conn();
			String sql = "SELECT * FROM employees";
			// Select문 사용시
			// 1. statement => where절 조건이 없으면 쓰기 편함
			// "SELECT * FROM employees where hire_date" + data	
			// 2. preparedStatement => where절 조건이 있어도 쓰기 편함
			
			stmt = conn.createStatement();
			// 조회하기 위해 연결
			
			// SQL실행
			rs = stmt.executeQuery(sql);
			// sql실행 결과 rs에 넣어줌
			
			// sql결과조회
			// ResultSet -> next() - 다음 row가 존재하면 true, 아니면 false
			while(rs.next()) {
				// 서로 다른 row를 서로 다른 객체에 저장하기 위해서
				emp = new EmpDTO();	
				emp.setEmployeeId(rs.getInt("employee_id")); 
				// 조회하고 난 결과의 컬럼명 그대로 써줘야 됨ㅇㅇ
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));
				// 문자는 문자열로 받아야 됨ㅇㅇ
				
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
		
	}
	
	// 2. 단건 조회
	public EmpDTO getEmployee(int employeeId){
		EmpDTO emp = null;
		try {
			conn();
			
			String sql = "SELECT * FROM employees WHERE employee_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				emp = new EmpDTO();
				
				emp.setEmployeeId(rs.getInt("employee_id")); 
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		// emp == null -> rs.next() == false -> 데이터조회x
		// emp != null -> rs.next() == true -> 데이터조회o
		return emp;
	}
	
	// 3. 추가
	
	public int empAdd(EmpDTO emp) {
		int result  = 0;
		// 데이터 입력 후 제대로 들어갔는지 확인하기 위한 용도
		// 1행이 입력되었습니다.
		// result = 1;
		
		try {
			
			conn();
			String sql = "INSERT INTO employees(employee_id, last_name, email, hire_date, job_id)"
						+ "VALUES(?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());
			pstmt.setString(3, emp.getEmail());
			pstmt.setDate(4, emp.getHireDate());
			pstmt.setString(5, emp.getJobId());
			
			//DML 사용 할 때 쓰는 메소드
			// 반환 1 또는 0
			// 1 : 데이터 정상 입력
			// 0 : 데이터 입력 안 됨
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	// 4. 수정
	public int empUpdate(EmpDTO emp) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE employees SET SALARY = ? WHERE EMPLOYEE_ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setDouble(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
	}
	// 5. 삭제
	public int empDelete(int employeeId) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, employeeId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	//DEPARTMENTS 전체조회
	public List<EmpDTO> getDepartmentList(){
	
		List<EmpDTO> list = new ArrayList<>();
		EmpDTO dep = null;
		
		try {
			conn();
			String sql = "SELECT * FROM departments";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
	
			while(rs.next()) {
				dep = new EmpDTO();
				//부서아이디, 부서명, 매니저아이디
				dep.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				dep.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
				dep.setManagerId(rs.getInt("MANAGER_ID"));
				
				list.add(dep);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}
	
	
	//DEPARTMENT 단건조회
	public EmpDTO getDepartment(int departmentId) {
		EmpDTO dep = null;
		
		try {
			conn();
			
			String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, departmentId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dep = new EmpDTO();
				
				dep.setDepartmentId(rs.getInt("department_id")); 
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return dep;
	}
	
	//DEPARTMENT 부서추가
	public int depAdd(EmpDTO dep) {
		int result  = 0;
		
		try {
			conn();
			String sql = "INSERT INTO departments(department_id, department_name) VALUES(?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dep.getDepartmentId());
			pstmt.setString(2, dep.getDepartmentName());
		
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;	
	}
	
	
	//DEPARTMENT 부서수정
	public int depUpdate(EmpDTO dep) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME = ? WHERE DEPARTMENT_ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dep.getDepartmentName());
			pstmt.setInt(2, dep.getDepartmentId());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//DEPARTEMNT 부서삭제
	public int depDelete(int departmentId) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, departmentId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	

}
