package com.yedam.oop;

public class Application04 {

	static int a = 1;
	void info() {
		System.out.println("info출력"); 
		}
	int field1;
	// 불가. 사용하려면 static권장ㅇㅇ 
	// 메소드 영역에 포함되어 있는 정적 메소드, main문
	public static void main(String[] args) {
		System.out.println(a);
		// 여기서는 a 인지 못 함ㅇㅇ
		// 이 시점에서는 a가 없는 것과 마찬가지임.
		// cuz main영역x
		// static 붙이던가
		// info(); // 불가
		
		Application04 temp = new Application04();
		temp.field1 = 1;
		
		System.out.println(StaticCAL.PI);
		System.out.println(StaticCAL.earthRadius);
		
		int result = StaticCAL.plus(10, 20);
		
		StaticCAL cal = new StaticCAL();
		
		// StaticCAL.PI = 10; // 변경불가 접근불가, 파이널을 지우면 수정 가능
		
	}

}
