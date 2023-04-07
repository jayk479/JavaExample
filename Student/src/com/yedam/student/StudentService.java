package com.yedam.student;

import java.util.List;

public class StudentService {

	public static Student studentInfo = null;
	
	public void getStudentList() {
		List<Student> list = StudentDAO.getInstance().getStudentList();
		for(Student student : list) {
			System.out.println("학번 : " + student.getStdNo());
			System.out.println("이름 : " + student.getStdName());
			System.out.println("전공 : " + student.getMajor());
			System.out.println("점수 : " + student.getScore());
		}
	}
}
