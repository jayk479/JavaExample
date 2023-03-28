package com.yedam.condition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int number = (int)(Math.random()*6)+1;
		System.out.println(number);
		
		// ex) number == 5
		// 순서대로 비교 후
		// System.out.println("5번나옴"); 실행, break;
		switch(number) {
		case 1 : 
			System.out.println("1번나옴");
			break;
		case 2 :
			System.out.println("2번나옴");
			break;
		case 3 :
			System.out.println("3번나옴");
			break;
		case 4 :
			System.out.println("4번나옴");
			break;
		case 5 :
			System.out.println("5번나옴");
			break;
			default : 
				System.out.println("6번나옴");
				break;
		}
		
		// 성적 확인
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("A학점취득");
			break;
		case 'B':
			System.out.println("B학점취득");
			break;
		case 'C':
			System.out.println("C학점취득");
			break;
		case 'D':
			System.out.println("D학점취득");
			break;
//			default:
//				break; //else랑 같아서 없어도 상관x
		}
		
		// 문자열 활용한 switch문
		String posiont = "과장";
		switch (posiont) {
		case "부장" :
			System.out.println("성과금 : 1000만원");
			break;
		case "차장" :
			System.out.println("성과금 : 500만원");
			break;
		case "과장" :
			System.out.println("성과금 : 300만원");
			break;
		default:
			System.out.println("성과금 : 100만원");
			break;
		}
		
		// 입력한 성적을 등급으로 환산
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력>");
		int score = sc.nextInt();
	
		
		// nextInt 입력값을 정수로 받는다
		// 100점 A
		// 90점 이상은 A 
		// 80 ~ 89 B
		// 70 ~ 79 C
		// 60 ~ 69 D
		// switch문만 활용
		
		switch(score/10) {
			case 10 :
			case 9:
				System.out.println("A학점취득");
				break;
			case 8 :
				System.out.println("B학점취득");
				break;
			case 7 :
				System.out.println("C학점취득");
				break;
			case 6 :
				System.out.println("D학점취득");
				break;
			default:
				System.out.println("F");
				break;
		}
		
		
	}

}
