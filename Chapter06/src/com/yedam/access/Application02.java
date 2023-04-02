package com.yedam.access;

public class Application02 {

	public static void main(String[] args) {
		// 인스턴스 생성
		Student std = new Student();
		std.setStdName("김또치");
		std.setGrade("2학년");
		std.setMajor("컴공");
		std.setPrograming(100);
		std.setDatatbase(50);
		std.setOs(100);
		
		System.out.println("이름 : " + std.getStdName());
		System.out.println("학과 : " + std.getMajor());
		System.out.println("학년 : " + std.getGrade());
		System.out.println("프로그래밍점수 : " + std.getPrograming());
		System.out.println("데이터베이스점수 : " + std.getDatatbase());
		System.out.println("운영체제점수 : " + std.getOs());
	}

}
