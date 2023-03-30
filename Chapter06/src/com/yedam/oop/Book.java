package com.yedam.oop;

public class Book {
	
	// book이라는 클래스는 아래의 정보를 가집니다.
	// 책이름, 책 종류, 가격, 도서번호, 출판사
	
	// 필드
	String title;
	String genre;
	int price;
	String booknum;
	String publisher;
	
	// 생성자
	// 생성자는 3개 정도 생성
	// 1) 기본생성자
	public Book() {
		
	}
	// 2) 모든 데이터를 초기화 할 수 있는 생성자
	public Book(String title, String genre, int price, String booknum, String publisher) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.booknum = booknum;
		this.publisher = publisher;
	}
	// 3) 책이름, 책가격, 도서번호를 받아오는 생성자
	public Book(String title, int price, String booknum) {
		this.title = title;
		this.price = price;
		this.booknum = booknum;
		// this(title, "학습서", price, booknum, "aaa");
	}
	
	// 메소드
	// 메소드는 getInfo() 메소드 가짐
	// getInfo() 메소드를 클래스 외부에서 실행하였을 때
	// 다음과 같은 출력물이 나오도록 구현
	// 객체.getInfo()
	void getInfo() {
		System.out.println("# 책이름 : " + title);
		System.out.println("# 내용");
		System.out.println("# 1) 종류 : " + genre);
		System.out.println("# 2) 가격 : " + price);
		System.out.println("# 3) 출판사 : " + publisher);
		System.out.println("# 4) 도서번호: " + booknum);
	}
	
	
	
	// # 책이름 : 혼자 공부하는 자바
	// # 내용
	// # 1) 종류 : 학습서
	// # 2) 가격 : 24000원
	// # 3) 출판사 : 한빛 미디어
	// # 4) 도서번호 : yedam001
	
	// # 책이름 : HTML
	// # 내용
	// # 1) 종류 : 학습서
	// # 2) 가격 : 15000원
	// # 3) 출판사 : 길벗
	// # 4) 도서번호 : yedam002
	
	// # 책이름 : JavaScript
	// # 내용
	// # 1) 종류 : 학습서
	// # 2) 가격 : 20000원
	// # 3) 출판사 : 길벗
	// # 4) 도서번호 : yedam003

	

}
