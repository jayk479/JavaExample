package com.yedam.access;

public class Application {

	public static void main(String[] args) {
		Member obj1 = Member.getInstance();
		Member obj2 = Member.getInstance();
		// 같은 객체ㅇㅇ
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		//springframwork에도 사용됨ㅇㅇ
		
		obj1.getInfo();
		System.out.println(obj2.age);
		
		
	}

}
