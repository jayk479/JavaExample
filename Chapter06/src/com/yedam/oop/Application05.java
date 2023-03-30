package com.yedam.oop;

import java.util.Scanner;

public class Application05 {

	public static void main(String[] args) {
		// 클래스 + 배열 => Student[] ary = new Student[10] ->10공간에 Student 객체 저장
		// int + 배열 => int[] ary = new int[10]; -> 10공간에 정수
		
		
		// 1. 학생수 | 2. 학생들 정보 입력 | 3. 학생들의 총점, 평균 | 4. 종료
		
		Scanner sc = new Scanner(System.in);
		int stdCount = 0;
		Student[] stdAry = null;
		while(true) {
			System.out.println("1. 학생수 | 2. 학생들 정보 입력 | 3. 학생들의 총점, 평균 | 4. 종료");
			System.out.println("메뉴 입력> ");
			String selectNo = sc.nextLine();
			
			if(selectNo.equals("1")) {
				System.out.println("학생수입력> ");
				stdCount = Integer.parseInt(sc.nextLine());
				//stdAry = new Student[stdCount];
				// 배열은 한 번 크기를 입력하면 수정 불가
			}else if(selectNo.equals("2")) {
				stdAry = new Student[stdCount];
//				String name;
//				int studentNum;
//				int kor;
//				int eng;
//				int math;
				for (int i = 0; i < stdAry.length; i++) {
					// 학생들의 정보 입력하는 공간
					// 객체를 생성하고 객체에 정보를 저장 한 다음 -> 배열에 보관
					// push?
					stdAry[i] = new Student();
					// i번째 배열에 학생클래스를 활용한 객체 생성ㅇㅇ
					System.out.println("학생이름> ");
					String name = sc.nextLine();
					stdAry[i].name = name;
					//s1이라고 가정
					//i=0
					// stdAry[0] = s1
					// stdAry.name = s1.name
					System.out.println("국어 성적> ");
					int kor = Integer.parseInt(sc.nextLine());
					stdAry[i].kor = kor;
					System.out.println("영어 성적> ");
					int eng = Integer.parseInt(sc.nextLine());
					stdAry[i].eng = eng;
					System.out.println("수학 성적> ");
					int math = Integer.parseInt(sc.nextLine());
					stdAry[i].math = math;
				}
				
			} else if(selectNo.equals("3")) {
				// 학생들 총점과 평균
				for (int i = 0; i < stdAry.length; i++) {
					System.out.println(stdAry[i].name + "의 학생 성적");
					System.out.println("총점 : " + stdAry[i].sum());
					System.out.println("평균 : " + stdAry[i].avg());
				}
				
			}else if(selectNo.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}else{
				System.out.println("없는 메뉴입니다. 다시 입력하세요.");
				
			} 
		}
		
	}

}
