package com.yedam.loof;

public class ForExample2 {

	public static void main(String[] args) {
		// 중첩 반복문
		// 2단 ~ 9단 구구단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
		// 별찍기
		// *****
		// *****
		// *****
		// *****
		// *****
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println("==================");
		for (int i = 1; i <=5 ; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// *****
		// ****
		// ***
		// **
		// *
		System.out.println("==================");
		for (int i = 1; i <=5 ; i++) {
			for (int j = 5; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
