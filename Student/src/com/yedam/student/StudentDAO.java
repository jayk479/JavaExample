package com.yedam.student;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class StudentDAO extends DAO{
	
	private static StudentDAO studentDao = null;
	
	private  StudentDAO() {
		
	}
	
	public static StudentDAO getInstance() {
		if(studentDao == null) {
			studentDao = new StudentDAO();
		}
		
		return studentDao;
	}
	
	//전체조회
	public List<Student> getStudentList() {
		List<Student> list = new ArrayList<>();
		Student student = null;
		try {
			conn();
			String sql = "SELECT * FROM STUDENT";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				student = new Student();
				student.setStdNo(rs.getInt("std_no"));
				student.setStdName(rs.getString("std_name"));
				student.setMajor(rs.getString("major"));
				student.setScore(rs.getDouble("score"));
				list.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}
	
}
