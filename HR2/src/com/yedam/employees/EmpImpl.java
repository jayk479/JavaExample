package com.yedam.employees;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpImpl {
	//EmpDAO 에서 실행한 쿼리문을 JAVA에서 활용부분
	Scanner sc = new Scanner(System.in);
	
	// 1. 전체조회
	public void getEmployeesList() {
		//SingleTon활용해서 setEmployeesList 사용
		List<EmpDTO> list = EmpDAO.getInstance().getEmployeesList();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("사번 : " + list.get(i).getEmployeeId());
			System.out.println("이름 : " + list.get(i).getLastName());
			System.out.println("급여 : " + list.get(i).getSalary());
			System.out.println("입사일 : " + list.get(i).getHireDate());
		}
	}
	
	// 2. 단건조회
	public void getEmployee() {
		System.out.println("조회할 사번> ");
		int employeeId = Integer.parseInt(sc.nextLine());
		EmpDTO emp = EmpDAO.getInstance().getEmployee(employeeId);
		
		if(emp == null) {
			System.out.println("해당 사번은 존재하지 않습니다");
		}else {
			System.out.println("사번 : " + emp.getEmployeeId());
			System.out.println("이름 : " + emp.getLastName());
			System.out.println("급여 : " + emp.getSalary());
			System.out.println("입사일 : " + emp.getHireDate());	
		}	
	}
	
	// 3. 추가
	public void empAdd() {
		EmpDTO emp = new EmpDTO();
		System.out.println("사번> ");
		int empId = Integer.parseInt(sc.nextLine());
		System.out.println("이름> ");
		String empName = sc.nextLine();
		System.out.println("이메일> ");
		String empEmail = sc.nextLine();
		System.out.println("입사일> ");
		// 입력한 문자열 -> java.sql.date로 변환해준다.
		Date empDate = Date.valueOf(sc.nextLine());
		System.out.println("직책> ");
		String empJob = sc.nextLine();
		
		emp.setEmployeeId(empId);
		emp.setLastName(empName);
		emp.setEmail(empEmail);
		emp.setHireDate(empDate);
		emp.setJobId(empJob);
		
		int result = EmpDAO.getInstance().empAdd(emp);
		
		if(result == 1) {
			System.out.println("데이터입력성공");
		}else {
			System.out.println("데이터입력실패");
		}
	}
	
	// 4. 수정
	public void empUpdate() {
		EmpDTO emp = new EmpDTO();
		System.out.println("사번> ");
		int empId = Integer.parseInt(sc.nextLine());
		System.out.println("급여> ");
		double empSalary = Double.parseDouble(sc.nextLine());
		
		emp.setEmployeeId(empId);
		emp.setSalary(empSalary);
		
		int result = EmpDAO.getInstance().empUpdate(emp);
		
		if(result > 0 ) {
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
	}
	
	//5. 삭제
	public void empDelete() {
		System.out.println("삭제 사번> ");
		int empId = Integer.parseInt(sc.nextLine());
		
		int result = EmpDAO.getInstance().empDelete(empId);
		if(result > 0) {
			System.out.println("정상삭제");
		}else {
			System.out.println("삭제실패");
		}
	}
	
	public void getDepartmentList() {
		List<EmpDTO> list = EmpDAO.getInstance().getDepartmentList();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("부서ID : " + list.get(i).getDepartmentId());
			System.out.println("부서명 : " + list.get(i).getDepartmentName());
			System.out.println("매니저번호 : " + list.get(i).getManagerId());
		}
		
	}
	
	public void getDepartment() {
		System.out.println("조회할 부서번호> ");
		int departmentId = Integer.parseInt(sc.nextLine());
		EmpDTO dep = EmpDAO.getInstance().getDepartment(departmentId);
		
		System.out.println("부서ID : " + dep.getDepartmentId());
		System.out.println("부서명 : " + dep.getDepartmentName());
		System.out.println("매니저번호 : " + dep.getManagerId());
	}
	
	public void depAdd() {
		EmpDTO dep = new EmpDTO();
		System.out.println("부서ID입력> ");
		int depId = Integer.parseInt(sc.nextLine());
		System.out.println("부서명입력 >");
		String depName = sc.nextLine();
		
		dep.setDepartmentId(depId);
		dep.setDepartmentName(depName);
		
		int result = EmpDAO.getInstance().depAdd(dep);
		
		if(result == 1) {
			System.out.println("추가완료");
		}else {
			System.out.println("추가실패");
		}
	}
	
	public void depUpdate() {
		System.out.println("부서ID> ");
		int depId = Integer.parseInt(sc.nextLine());
		System.out.println("부서명수정> ");
		String depName = sc.nextLine();
		
		EmpDTO dep = new EmpDTO();
		dep.setDepartmentId(depId);
		dep.setDepartmentName(depName);
		
		int result = EmpDAO.getInstance().depUpdate(dep);
		
		if(result > 0 ) {
			System.out.println("부서수정성공");
		}else {
			System.out.println("부서수정실패");
		}
	}
	
	public void depDelete() {
		System.out.println("삭제 부서ID> ");
		int depId = Integer.parseInt(sc.nextLine());
		
		int result = EmpDAO.getInstance().depDelete(depId);
		if(result > 0) {
			System.out.println("정상삭제");
		}else {
			System.out.println("삭제실패");
		}
		
	}
}
