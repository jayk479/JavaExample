package com.yedam.array;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// p.201 6번
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
				
			}else if(selectNo == 4) {
				int maxScore = scores[0];
				int sumScore = 0;
				double avgScore = 0;
				for (int i = 0; i < scores.length; i++) {
					if(maxScore < scores[i]) {
						maxScore = scores[i];
					}
					sumScore += scores[i];
				} 
				avgScore = (double)sumScore/scores.length;
				System.out.println("최고 점수 : " + maxScore);
				System.out.println("평균 점수 : " + avgScore);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
	}

};