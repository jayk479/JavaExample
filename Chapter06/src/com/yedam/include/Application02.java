package com.yedam.include;

import com.yedam.access.Access;

public class Application02 {
	public static void main(String[] args) {
		Access ac = new Access();
		// ctrl + shift + o import 위치 한 개만 있을 때 가능ㅇㅇ
		
		// public
		ac.free = "public";
				
		// protected
		// ac.parent = "protected";
		// 안 됨. 다른 패키지 임.
				
		// default
		// ac.basic = "default";
		// 안 됨. 다른 패키지임.
				
		// private
		// ac.privacy = "private"; 
		
		
	
	
	}

}
