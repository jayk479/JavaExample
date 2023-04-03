package com.yedam.exception;

import java.sql.SQLDataException;

public class Application {
	public static void main(String[] args) throws ClassNotFoundException {
//		try {
//			// 예외 발생할 것 같은 실행코드
//		} catch (예외) {
//			// 예외 발생 후 처리하는 코드
//		}finally {
//			// 옵션
//			// try문 또는 catch문 실행 후 
//			// 무조건 실행해야하는 코드
//		}
		String data1 = null;
		String data2 = null;
		
		try {
//			data1 = args[0];
//			data2 = args[1]; // 배열 범위 벗어남ㅇㅇ
//			double avg = 1/0;
			
//			String str = "자바";
//			int a = Integer.parseInt(str);
			
//			Class clazz = Class.forName("java.lang.String2");
			
	
		} catch (ArrayIndexOutOfBoundsException e) {
				// 배열 범위 벗어났을 때 나오는 오류ㅇㅇ
				// 예외와 매칭이 되는 오류만 잡아줌ㅇㅇ
				// 다른 오류는 못 잡음ㅇㅇ
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			// 스위치문이랑 비슷함.
			// 상기 catch문과 안 맞으면 아래 catch문으로 이동함ㅇㅇㅇ
		}catch (NumberFormatException e) {
			System.out.println("문자열 변환 에러");
//		}catch (ClassNotFoundException e) {
//			System.out.println("클래스를 찾을 수 없다.");}
		}catch (Exception e) {
			System.out.println("위에서 처리 못하면 내가 처리한다.");
		}finally {
			System.out.println("finally 항상 실행");
		}
	}
}
