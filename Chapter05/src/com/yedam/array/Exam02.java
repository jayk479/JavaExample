package com.yedam.array;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		// 배열의 크기
		Scanner sc = new Scanner(System.in);
		int[] ary;
		int no;
		
//		ary = new int[10];
//		System.out.println(ary.length);
		
		System.out.println("배열의 크기 입력>");
		no = sc.nextInt();
		
		//입력받은 값을 배열의 크기로 사용
		ary = new int[no];
		
		System.out.println("배열의 크기 : " + ary.length);
		// 배열의 크기를 10으로설정했다라고 했을 때
		// 배열.length를 활용해서 배열의 크기만큼 반복문을 실행
		for (int i = 0; i < ary.length; i++) {
			System.out.println("입력>");
			// i = 0, ary[0] = 입력한데이터
			// i = 1, ary[1] = 입력한데이터
			// i = 2, ary[2] = 입력한데이터 ...
			ary[i] = sc.nextInt();
		}
		
		for (int i = 0; i < ary.length; i++) {
			System.out.println("ary["+i+"] : " + ary[i]);
		}
		
		
		
		
		
		
	}

}
