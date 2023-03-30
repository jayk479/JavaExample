package com.yedam.oop;

public class Application02 {

	public static void main(String[] args) {
		Car sonata = new Car("소나타", 10000);
		// 생성자 통해서 매개변수 초기화 했음ㅇㅇ
		
		// Car는 type임
		// sonata는 Car클래스 안의 내용 실행 가능
		
		System.out.println(sonata.company);
		System.out.println(sonata.name);
		System.out.println(sonata.price);
		System.out.println();
		Car k5 = new Car("K5", 9000, "기아자동차");
		System.out.println(k5.company);
		System.out.println(k5.name);
		System.out.println(k5.price);
		
		
//		sonata.name = "소나타";
//		sonata.price = 10000;
//		
//		System.out.println();
//		System.out.println(sonata.company);
//		System.out.println(sonata.name);
//		System.out.println(sonata.price);
	
//		sonata.company = "기아자동차"; // 필드에서 정해진 것도 수정 가능
//		System.out.println();
//		System.out.println(sonata.company);
//		System.out.println(sonata.name);
//		System.out.println(sonata.price);
//		
//		// 같은 클래스를 가지고도 다른 것 만들 수 있음
//		// 만들 객체의 공통적인 부분은 미리 클래스에 만들어두면 편하겠지
//		Car kona = new Car();
//		System.out.println("===코나===");
//		System.out.println(kona.company);
//		System.out.println(kona.name);
//		System.out.println(kona.price);
//		
//		kona.name = "코나";
//		kona.price = 100;
//		
//		System.out.println();
//		System.out.println(kona.company);
//		System.out.println(kona.name);
//		System.out.println(kona.price);
	}
	
	

}
