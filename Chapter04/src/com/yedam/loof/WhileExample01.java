package com.yedam.loof;

import java.util.Scanner;

public class WhileExample01 {

	public static void main(String[] args) {
		// 1~100사이에서 2의 배수만 출력
//		int i = 1;
//		while(i <= 100){
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		
		
//		int menuNo = 0;
		Scanner sc = new Scanner(System.in);
//		while(menuNo != 4) {
//			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
//			System.out.println("메뉴선택>");
//			// 1 ~ 4
//			menuNo = sc.nextInt();
//			switch (menuNo) {
//			case 1:
//				System.out.println("덧셈 실행");
//				break;
//			case 2:
//				System.out.println("뺄셈 실행");
//				break;
//			case 3:
//				System.out.println("곱셈 실행");
//				break;
//			case 4:
//				System.out.println("프로그램 종료");
//				break;
//			}
//		}
		
		// 오락실
		int money;
		int menu = 0;
		System.out.println("====insert Coin====");
		money = sc.nextInt();
		// 1) 게임 1회 실행시 금액 500원 차감
		// 2) 내가 투입한 금액 만큼만 반복문 돌린다. 게임을 할 수 없는 금액이면 반복문 종료
		// 3) 게임 기회가 몇 번 남았는지 표시하는 기능
		// ex) 1500원 세 번의 기회가 남아 있습니다.
		
		while(money/500>0) {
//			///여기쯤///
			System.out.println((money/500)+"번의 기회가 있습니다.");
			System.out.println(money + "원 남았습니다.");
			
			System.out.println("1. 가위바위보 | 2. 앞뒤맞추기 | 3. 종료");
			System.out.println("입력>>");
			menu = sc.nextInt();
			
//			if(menu == 1) {
//				System.out.println("가위바위보");
//			}else if(menu == 2) {
//				System.out.println("앞뒤맞추기위");
//			}else if(menu == 3) {
//				System.out.println("오락실 종료");
//			}else {
//				System.out.println("없는 메뉴입니다.");
//			}
			// break는 반복문 탈출에 쓰인다ㅇㅇ
			
			if(menu == 1) {
				System.out.println("가위바위보");
				money = money-500;
				// System.out.println("남은 돈 : " + money);
				// System.out.println("남은 기회 : " + money/500);
			}else if(menu == 2) {
				System.out.println("앞뒤맞추기");
				money = money-500;
				// System.out.println("남은 돈 : " + money);
				// System.out.println("남은 기회 : " + money/500);
			}else if(menu == 3) {
				System.out.println("오락실 종료");
				// System.out.println("남은 돈 : " + money);
				// System.out.println("남은 기회 : " + money/500);
				break;
			}else {
				System.out.println("없는 메뉴입니다.");
			}
			
			if(0 <= money && money < 500) {
				System.out.println("오락실 종료");
				break;
			}
		}
		
		// do-while
//		int month;
//		do {
//			System.out.println("올바른 월을 입력하세요[1-12]");
//			month = sc.nextInt();
//		}while(month < 1 || month > 12);
		
		
		// break, continue
		// 무한 루프 -> 항상 true -> 항상 조건 만족 -> 반복문이 계속 실행
//		while(true) {
//			int num = (int)(Math.random()*6)+1;
//			System.out.println(num);
//			if(num == 6) {
//				System.out.println("while 종료");
//				break; // 반복문 탈출 할 때 사용
//			}
//		}
		
		// 중첩for문안에서의 break;
//		i+j = 4 0+4
//		i+j = 4 1+3
//		i+j = 4 2+2
//		i+j = 4 3+1
//		i+j = 4 4+0
//		for (int i = 0; i <= 10; i++) {
//			for (int j = 0; j <= 10; j++) {
//				if(i+j == 4) {
//					System.out.println("i+j = "+ (i+j));
//					break; // break문이 몸담고 있는 반복문만 종료
//				}
//			}
//		}
		
//
//		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
//			for(char lower = 'a'; lower <= 'z'; lower++) {
//				System.out.println(upper + "-" + lower);
//				if(lower == 'g') {
//					break Outter; // 밖의 반복문에 이름 부여, break시 지목하면 멈춤ㅇㅇ
//				}
//			}	
//		}
//		
//		// continue
//		// continue를 기준으로 반복문 재실행
//		for(int i = 0; i <= 10; i++) {
//			if(i%2 == 0) {
//				continue;
//			}
//			System.out.println(i); // 홀수출력
//		}
//		
		
		
		
		
		
		
		
		
		
	
	
	}
	

}
