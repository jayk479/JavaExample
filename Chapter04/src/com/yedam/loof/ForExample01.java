package com.yedam.loof;

public class ForExample01 {

	public static void main(String[] args) {
		int sum = 0;
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		//1~5까지의 합
		System.out.println(sum);
		
		sum = 0;
		//int i는 임시변수, for문 끝나면 i사라짐ㅇㅇ
		for(int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		// 규칙찾기ㅇㅇ
		
		
		
		
	}

}
