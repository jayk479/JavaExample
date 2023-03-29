package com.yedam.array;

public class Exam05 {

	public static void main(String[] args) {
		// 최대값의 인덱스 구하기
		
		int[] array = {10, 50, 70, 20, 30, 80, 40}; // 5
		//최대값, 최대값의 인덱스ㅇㅇ
		
		int max = array[0];
		int indexNo = 0;
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				indexNo = i;
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("max인덱스넘버 : " + indexNo);
	
	}

}
