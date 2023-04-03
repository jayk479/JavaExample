package com.yedam.abs;

public class PhoneExample {
	public static void main(String[] args) {
		Phone p1 = new SmartPhone("박또치");
		System.out.println(p1.ownner);
		p1.turnOn();
		p1.turnOff(); // 추상메소드를 실체클래스에서 오버라이딩 한 거
		
	
	}

}
