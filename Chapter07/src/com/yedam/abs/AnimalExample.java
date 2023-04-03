package com.yedam.abs;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-----------------");
		
		// 추상클래스를 다형성을 활용해서 표현
		
//		Animal animal = new Dog();
//		// 자동타입변환ㅇㅇ
//		animal.sound();
//		animal = new Cat();
//		animal.sound();
		
		animalSound(new Dog()); // 주소값
		animalSound(dog); // 주소값이 들어있는 변수
		animalSound(new Cat());
		
		
	}
	
	//매개변수의 다형성을 활용한 추상클래스 사용
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
