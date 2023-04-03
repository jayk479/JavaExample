package com.yedam.abs;

public class SmartPhone extends Phone {
	
	

	public SmartPhone(String ownner) {
		// 부모클래스를 객체로 만드는 과정
		super(ownner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷검색합니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("반드시 구현한 turnoff 메소드");
	}

}
