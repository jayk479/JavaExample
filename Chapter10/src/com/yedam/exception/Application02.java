package com.yedam.exception;

public class Application02 {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 어떤 문제인지 콘솔에 찍어줌ㅇㅇ
			System.out.println("클래스가존재하지않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
