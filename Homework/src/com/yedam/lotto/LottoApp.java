package com.yedam.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	private Scanner sc = new Scanner(System.in); 
	int menu = 0;
	
	int[] lotto = new int[6];
	List<int[]> list = new ArrayList<>();
	
	
	public LottoApp() {
		//list.add(lotto);
		run();
	}
	
	private void run() {
		while(menu != 99) {
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 로또 생성 | 2. 로또 조회 | 99. 프로그램종료");
		menu = Integer.parseInt(sc.nextLine());
		
			switch (menu) {
			case 1:
				makeLotto();
				// 로또 번호 생성
				break;
			case 2:
				showInfo();
				// 로또 번호 조회
				break;
			case 99:
				System.out.println("프로그램종료");
				break;
				}
		}
		
	}
	
	private void showInfo() {
		//System.out.println(list.get(1));
		System.out.println("투입금액 : " + (list.size()*1000));
		for (int i = 0; i < list.size(); i++) {
			System.out.print((i%5+1)+"번> ");
			for (int j = 0; j < 6; j++) {
				int[] lottoList = list.get(i);
				System.out.print(lottoList[j] + " ");
			}
			System.out.println();
			if((i+1)%5 == 0) {
				System.out.println("====================");
				}
			}
			
			
//			for (int j = 0; j < 6; j++) {
//				System.out.print(list.get(i)[j] + " ");
//			}
//			String lottoList = String.valueOf(list.get(i));
//			//System.out.println(lottoList);
//			for (int j = 0; j < lottoList.length(); j++) {
//				System.out.print(lottoList.charAt(i) + " ");
//			}
//			if(i == 4) {
//			}
//		}
	}
	
	private void makeLotto() {
		// 1. 입력한 금액만큼 로또번호 생성
		// ex)만원 -> 로또 번호 10개
		// list에 저장
		System.out.println("금액투입> ");
		int money = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < (money/1000); i++) {
			makeNumber();
			list.add(lotto);
		}
//		for (int j = 0; j < list.size(); j++) {
//			int[] lottoList = list.get(j);
//			System.out.print(lottoList[j] + " ");
//		}
		System.out.println("번호출력완료");
	}
	private void makeNumber() {
		//로또 번호 6개 만드는거
		//단, 중복은 발생하면 안 됨
		//정렬 안 해도 됨ㅇㅇ
		//잘 되었는지 출력
//		for (int i = 0; i < lotto.length; i++) {
//			int num = (int)(Math.random()*45)+1;
//			for (int j = 0; j < i; j++) {
//				if(lotto[j] == lotto[i]) {
//				num = (int)(Math.random()*45)+1;
//					j--;
//				}
//			}
//			lotto[i] += num;
//			System.out.print(lotto[i]+" ");
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {	
			lotto[i] = (int)(Math.random()*45)+1;
			if(i>0) {
				for (int j = 0; j < i; j++) {
					if(lotto[j] == lotto[i]) {
					lotto[i] = (int)(Math.random()*45)+1;
					j =-1;
					}
				}
			}
			// System.out.print(lotto[i]+" ");
			}
			 //System.out.println();	
	}
}
