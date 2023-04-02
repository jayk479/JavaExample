package com.yedam.poly;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	// 필드의 다형성ㅇㅇㅇㅇ

	
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop(); return 1; 
			};
		if(frontRightTire.roll() == false) { 
			stop(); return 2; 
			};
		if(backLeftTire.roll() == false) { 
			stop(); return 3; 
			};
		if(backRightTire.roll() == false) { 
			stop(); return 4; 
			};
		return 0; //리턴 1234 => 위치
	}
	
	void stop() {
		System.out.println("[자동차가멈춥니다.]");
	}
}
