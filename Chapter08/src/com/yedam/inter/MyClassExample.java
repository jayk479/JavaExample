package com.yedam.inter;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)---------");
		
		// 클래스 내부에인터페이스를 활용해서 필드로선언
		MyClass myclass1 = new MyClass();
		
		myclass1.rc.turnOn();
		myclass1.rc.turnOff();
		
		System.out.println("2)---------");
		MyClass myclass2 = new MyClass(new Audio());
		
		System.out.println("3)---------");
		MyClass myclass3 = new MyClass();
		myclass3.methodA();

		System.out.println("4)---------");
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Television());
		myclass4.methodB(new Audio());
		
		
	}

}
