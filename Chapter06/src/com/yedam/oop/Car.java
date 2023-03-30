package com.yedam.oop;

public class Car {
	// 필드 -> 객체의 정보
	String name;
	int price;
	String company = "현대자동차";
	
	
	
	// 생성자
	// 기본생성자
	public Car() {
		// 생성자 이름은 같으나 매개변수 다르면 괜찮음
		// 이렇게 구별하는 방식이 오버로딩ㅇㅇ
		
		
	}
	// 매개 변수를 가지는 생성자
//	public Car(String n, int p) {
//		name = n;
//		price = p;
//	}
	
	
	public Car(String name) {
		this(name, 10000, "기아자동차");
	}
	public Car(int price) {
		this.price = price;
	}
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		// 객체 안에서의 this는 자기자신
		// Car클래스 안의 name = this
	}
	public Car(int price, String name) {
		this.name = name;
		this.price = price;
	}
	// 단점 중복발생
	
	public Car(String name, int price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	// 메소드
}
