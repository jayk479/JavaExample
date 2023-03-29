package com.yedam.reference;

public class Exam01 {

	public static void main(String[] args) {
		// stack영역에 intVal가 생성되어 10이라는 데이터가 저장
		int intVal = 10;
		
		// 참조타입
		// stack영역에 array가 생성 (참조 : [I@182decdb)되고 
		// 다음과 같은 주소가 저장되어 있다.
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		
		System.out.println(array); // [I@182decdb
		// array 안의 데이터가 들어있는 주소가 들어있음ㅇㅇ
		System.out.println(array2); // [I@7637f22
		// 같은 데이터라도 데이터 주소 다름ㅇㅇ
		// 저 주소가 heap영역의 주소
		System.out.println(array == array2); // false
		// 182decdb와 [I@7637f22비교한거임ㅇㅇ
		System.out.println(array3); // 선언만하고 값 안 넣어주면 오류남, null값 넣어주면 됨ㅇㅇ
		System.out.println(array3.length); // NullPointerException

	}

}
