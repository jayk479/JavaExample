package test;

import java.util.Iterator;
import java.util.Scanner;

public class test {

		public static void main(String[] args) {
			
			//1.
			int num1 = 10;
			double num2 = 2.0;
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			
			//2.
			num1 = 10;
			num2 = 20;
			boolean result;
			 result = ((num1 > 10) || (num2) > 10);
			 System.out.println(!result);
			 
			 //3.
			 int[] coinUnit = {500, 100, 50, 10};
			 int money = 2680;
			 System.out.println("money=" + money);
			 for (int i = 0; i < coinUnit.length; i++) {
				 System.out.print(coinUnit[i] + "원 : " + (money/coinUnit[i]) + "개 ");
				 // money = money-((money/coinUnit[i])*coinUnit[i]);
				 money = money%coinUnit[i];
			}
			 System.out.println();

			//4. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 작성해보세요/

			 for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
				System.out.println("------");
			}
			 
			 //5.
			 Scanner sc = new Scanner(System.in);
			 int diceNum = 0;
			 // int diceCount = 0;
			 int[] dice = null;
			 boolean run = true;
			 
			// 이하 정답
			 
			 while(run) {
				 System.out.println("===1. 주사위 크기 | 2. 주사위 굴리기 | 3. 결과 보기 | 4. 가장 많이 나온 수 | 5. 종료 ===");
				 System.out.println("메뉴 >");
				 int selectNo = sc.nextInt();
				 switch (selectNo) {
				case 1:
					System.out.println("주사위크기> ");
					diceNum = sc.nextInt();
					 if(5 > diceNum || diceNum > 10) {
						 System.out.println("주사위 크기는 5~10"); 
					 }
					break;
				case 2:
					if(diceNum != 0) {
						dice = new int[diceNum];
						int count = 0; // 몇 번 반복했는지
						// 5가 언제 나왔는지 모르기 때문에, 5가 나올 때까지 반복하기 위해
						while(true) {
							int dicePlay = (int)(Math.random()*diceNum)+1;
							// dice[dicePlay-1] = dice[dicePlay-1]+1;
							dice[dicePlay-1]++;
							count++;
							if(dicePlay == 5) {
								break;
							}
						}
						System.out.println("5가 나올 떄까지 주사위를 " + count + "번 돌렸습니다.");
					}else {
						System.out.println("주사위크기재입력");
					}
					break;
				case 3:
					for (int i = 0; i < dice.length; i++) {
						System.out.println((i+1)+"은" + dice[i]+"번 나왔습니다.");
					}
					break;
				case 4:
					int max = dice[0];
					int index = 0;
					for (int i = 0; i < dice.length; i++) {
						if(max<dice[i]) {
							max = dice[i];
							index = i;
						}
					}
					System.out.println("가장 많이 나온 수 : " + (index + 1) + "입니다.");
					break;
				case 5:
					 System.out.println("프로그램종료");
					break;
		
				 
			 }
//			 while(true) {
//				 System.out.println("===1. 주사위 크기 | 2. 주사위 굴리기 | 3. 결과 보기 | 4. 가장 많이 나온 수 | 5. 종료 ===");
//				 System.out.println("메뉴 >");
//				 int selectNo = sc.nextInt();
//				 if(selectNo == 1) {
//					 System.out.println("주사위 크기> ");
//					 diceNum = sc.nextInt();
//					 if(5 > diceNum || diceNum > 10) {
//						 System.out.println("주사위 크기는 5~10"); 
//					 }
//				 }else if(selectNo == 2) {
//						dice = new int[diceNum]; // 배열길이어떻게정함?
//						 for (int i = 0; i < dice.length; i++) {
//							int dicePlay = (int)(Math.random()*diceNum)+1;
//							dice[i] = dicePlay;
//							if (dicePlay == 5) {
//								 System.out.println("5가 나올때까지 주사위를 " + (i+1)+"번 굴렸습니다.");
//								 break;
//							}
//						}
//				 }else if(selectNo == 3) {
//					
//					 for (int i = 0; i < dice.length; i++) {
//						 // System.out.print(dice[i]+ " ");
//						for (int j = 1; j <= diceNum; j++) {
//							
//						}
//					}
//				 }else if(selectNo == 4) {
//			
//					 // System.out.println("가장 많이 나온 수는 " + max);
//					
//				 }else if(selectNo == 5) {
//					 System.out.println("프로그램종료");
//					 break;
//				 }else {
//					 System.out.println("다시 입력");
//				 }
//			 }
//			 
		}

}
