package com.yedam.poly;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		//bus, texi의 부모 vehicle의 객체를 매개변수로 넣음ㅇㅇ
		// => 1. 자신 2. 자식이 들어올 수 있음
		vehicle.run(); //자식이재정의한run()실행ㅇㅇ
	}

}
