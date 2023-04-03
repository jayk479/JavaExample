package com.yedam.abs;

public abstract class Phone {
	public String ownner;
	
	public Phone(String ownner) {
		this.ownner = ownner;
	}
	
	public void turnOn() {
		System.out.println("폰전원을 켭니다");
	}
	
	// 꼭 만들어야 된다고 설계해 주는 거ㅇㅇ
	public abstract void turnOff();
}
