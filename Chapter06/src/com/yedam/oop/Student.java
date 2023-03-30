package com.yedam.oop;

public class Student {
	// 학생이름, 학번, 국, 영, 수 점수를 가지는 학생

	String name;
	int studentNum;
	int kor;
	int eng;
	int math;
	
	// 기본 생성자와 모든 데이터를 초기화 할 수 있다.
	public Student() {
		
	}
	public Student(String name, int studentNum, int kor, int eng, int math) {
		this.name = name;
		this.studentNum = studentNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 학생의 정보를 출력하는 getInfo()
	// 1) 총점
	// 2) 평균
	// --------
	// 이름 : 
	
	// 학번 : 
	// 총점 : 
	// 평균 : 
	
	void getInfo() {
//		int sumScore = kor + eng + math;
//		double avgScore = (double)sumScore / 3;
		
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + studentNum);
		System.out.println("총점 : " + sum());
		System.out.println("평균 : " + avg());
	}
	
	int sum() {
		return kor + eng + math;
	}
	double avg() {
		return (double)sum() / 3;
	}
}
