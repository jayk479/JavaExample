package com.yedam.inheri;

public class CellPhone {
	// 핸드폰 기본 기능을 그현
	// 부모 클래스
	
	//필드
	String model;
	String color;
	
	//생성자
	// 기본생성자
//	public CellPhone() {}
	
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	//메소드
	public void powerOn() {
		System.out.println("전원을켭니다");
	}
	public void powerOff() {
		System.out.println("전원을끕니다");
	}
	public void bell() {
		System.out.println("전화가옵니다");
	}
	public void hangUp() {
		System.out.println("전화를끊습니다");
	}
	
	
}
