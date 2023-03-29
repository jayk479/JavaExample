package com.yedam.array;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		// 배열에 담긴 최대, 최소값
		
		Scanner sc = new Scanner(System.in);
		
		int[] ary;
		int no;
		
		System.out.println("배열의 크기>");
		no = sc.nextInt();
		sc.nextLine();
		// no에 정수 입력 후 엔터 치고 숫자는 no에 대입, 아직 엔터키 남아있음.
		// 이 남은 엔터가 이하 for문 안의 nextLine()과 만나 " "가 int가 되어버림
		// 그래서 엔터를 없애기 위해 첫번째 방식 => sc.nextLine(); 입력해준다.
		// 두 번째 방식 => no = Integer.parseInt(sc.nextInt()); 해주기
		ary = new int[no];
		
		//배열에 데이터 입력
		for (int i = 0; i < ary.length; i++) {
			System.out.println("데이터 입력?");
			ary[i] = Integer.parseInt(sc.nextLine());
		}
		
		// 최대값 구하기
		int max = ary[0];
		for (int i = 0; i < ary.length; i++) {
			if(max < ary[i]) {
				max = ary[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		// 최소값 구하기
		int min = ary[0]; // 초기값이 0일 경우 무조건 이게 min, 내부 데이터 써주기 
		for (int i = 0; i < ary.length; i++) {
			if(min > ary[i]) {
				min = ary[i];
			}
		}
		System.out.println("최소값 : " + min);
	
		
		
		
	}

}
