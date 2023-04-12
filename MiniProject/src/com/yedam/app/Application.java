package com.yedam.app;

import java.util.Scanner;

import com.yedam.member.MemberService;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();
	String menu = "";
	
	public Application() {
		run();
	}
	
	public void run() {
		while(true) {
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 프로그램종료");
		System.out.println("입력> ");
		menu = sc.nextLine();
			if(menu.equals("1")) {
				ms.login();
				if(MemberService.memberInfo != null) {
					new MemberControl();
				}
			}else if(menu.equals("2")) {
				ms.memberAdd();
			}else if(menu.equals("3")) {
				System.out.println("프로그램종료");
				break;
			}else {
				System.out.println("오입력");
			}
		}
	}

}
