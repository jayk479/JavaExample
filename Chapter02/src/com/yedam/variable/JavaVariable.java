package com.yedam.variable;

public class JavaVariable {

	public static void main(String[] args) {
		//v1 변수 생성 후 15의 값을 초기화
		int v1 = 15;
		
		if(v1>10) {
			int v2 = v1 -10;
		}
		//int v3 = v1 + v2;
		//v2는 변수사용범위벗어남ㅇㅇ
		//메모리에서 이미 삭제 되었음.
		
		int v4;
		//v4 = v1 + v4;
		//선언만 되고 초기화 되지 않음. 
	}
	//v1 = 10;
	//변수사용범위벗어남ㅇㅇ
}
