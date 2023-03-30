package com.yedam.oop;

public class Application03 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		//메소드 호출
		cal.sum(10, 20);
		
		int result = cal.sum3(new int[]{1,2,3,4,5,6,76,87,9});
		System.out.println("sum3 : " + result);
		
		result = cal.sum4(1,2,3,4,5,6,7,8,9,9);
		System.out.println("sum4 : " + result);
		
		Bycle bycle = new Bycle();
		bycle.setGas(5);
	
		boolean gasState = bycle.isLeftGag();
		if(gasState == true) {
			System.out.println("출발");
			bycle.run();
		}
		
		if(bycle.isLeftGag()) {
			System.out.println("gas주입필요없음");
		}else {
			System.out.println("gas주입필요");
		}
		
		double result2 = cal.avg();
		System.out.println("평균 : " + result2);
		
		double result3 = cal.areaRectangle(10);
		double result4 = cal.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 : " + result3);
		System.out.println("직사각형의 넓이 : " + result4);
		
		Book book1 = new Book("혼자 공부하는 자바", "학습서", 24000, "한빛 미디어", "yedam001");
		// System.out.println(book.title);
		Book book2 = new Book();
		Book book3 = new Book("JavaScript",20000,"yedam003");
		book2.title = "HTML";
		book2.genre = "학습서";
		book2.price = 15000;
		book2.publisher = "길벗";
		book2.booknum = "yedam002";
		
		book1.getInfo();
		book2.getInfo();
		book3.getInfo();
		System.out.println();
		
		Student st1 = new Student("AAA", 1234, 63, 94, 78);
		Student st2 = new Student();
		st2.name = "BBB";
		st2.studentNum = 5678;
		st2.kor = 90;
		st2.eng = 80;
		st2.math = 70;
		st1.getInfo();
		System.out.println();
		st2.getInfo();

	}

}
