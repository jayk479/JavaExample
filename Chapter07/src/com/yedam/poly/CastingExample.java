package com.yedam.poly;

public class CastingExample {
	
	public static void main(String[] args) {
		// 강제타입변환(캐스팅)
		// 부모타입으로 만들어진 다형성
		// (부모가 가진 내용만 사용하되, 자식클래스에서 오버라이딩 된 내용은 자식클래스 것을 사용)
		// 부모가 자식이 가진 내용도 쓰고 싶다. -> 강제타입변환
	
		// 자동타입변환
		Parent parent = new Child();
		parent.field = "부모필드";
		parent.method1(); // 부모클래스
		parent.method2(); // 자식클래스에 오버라이딩
		
		//parent.method3();
		//parent.field2 = "자식필드";
		// 상기내용사용하고 싶은거 강제타입변환(casting)
		// 조건 : 클래스간의 자동타입변환이 발생 후 사용 가능
		
		Child child = (Child)parent; // 강제형변환ㅇㅇ
		child.field = "부모필드";
		child.method1();
		child.method2(); // 부모클래스의 메소드 사용
		child.field2 = "자식필드";
		child.method3(); // 자식클래스의 메소드 추가 사용 가능
		
		// instanceof
		// 같은 인스턴스인지 사용
		// == : 주소 비교
		// instanceof : 같은 타입의 객체인지 확인
		
		Parent p1 = new Parent();
		Parent p2 = new Parent();
		if(p1 == p2) {
			System.out.println("주소가 같음");
		}else {
			System.out.println("주소가 다름");
		}
		
		if (p1 instanceof Parent) {
			System.out.println("p1은 Parent타입입니다");
		}else {
			System.out.println("p1은 Parent타입이 아닙니다.");
		}
		
		if(parent instanceof Parent) {
			System.out.println("부모타입");
		}
		if(parent instanceof Child) {
			System.out.println("자식타입");
		}
		
	}

}
