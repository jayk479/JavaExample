package com.yedam.inheri;

public class Application01 {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.lastName = "이";
		child.getInfo();
		
		// child.money = 1000;
		// money는 private로 되어있어서 상속제외.
	}

}
