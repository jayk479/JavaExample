package com.yedam.exception;

public class ExceptionExam {
	public static void main(String[] args) {
		// NullPonintException
//		String data = null;
//		System.out.println(data.toString());
		
//		Example example = null;
//		System.out.println(example.toString());
		
		//ArrayIndexOutOfBoundsException
		int[] intAry = new int[3];
		
		intAry[2] = 3;
		// intAry[4] = 3;
		
//		for (int i = 0; i <= intAry.length; i++) {
//			System.out.println(intAry[i]);
//		}
		
		
		//NumberFormatException
		String str = "123";
		int val = Integer.parseInt(str);
		System.out.println(val);
		
		//예외
//		String str2 = "자바";
//		val = Integer.parseInt(str2);
		
		// ClassCastException
		// 자동타입변환 된 객체를 강제타입반환 할 때 발생
		// 정상
		//Example exam = new Exam();
		//Exam exam02 = (Exam)exam;
		
		// 예외
//		Example exam2 = new Exam();
//		Exam02 exam03 = (Exam02)exam2;
		
		// ClassNotFoundException
		// 클래스 파일 찾지 못 할 때
		// 실행메소드(main) 못 찾을 때 자주 발생
		
		// ArithemticEceptcion
		// 분모가 0일 때
		// double a = 1/0;
		
		// 반복문을 종료하지 못하고 무한 루프.
		// OutofMemberError : 
		// 메모리 부족 할 때 발상.
		// 메모리 누수, (memory leak)
		
		// IOEception -> 입출력 오류
		// file reading/write
		
		// FileNotFoundException
		// Java -> file reading
		// 경로가 안 맞아서 파일을 못 찾았다.
		
		
	}
}
