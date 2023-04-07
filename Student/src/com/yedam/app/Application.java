package com.yedam.app;

import java.util.Scanner;

import com.yedam.student.StudentService;

public class Application {

	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
	int menu = 0;
	
	public Application() {
		run();
	}
	
	public void run() {
		boolean run = true;
		
		System.out.println("1. 학생정보조회 | 2. 학생등록 | 3. 학생정보삭제 | 4. 전공변경 | 5. 종료");
		System.out.println("select> ");
		menu = Integer.parseInt(sc.nextLine());
		while(run) {
			if(menu == 1) {
				ss.getStudentList();
				
			}else if(menu == 2) {
				
				
			}else if(menu == 3) {
				
				
			}else if(menu == 4) {
				
				
			}else if(menu == 5) {
				System.out.println("프로그램종료");
				run = false;
				//break;
			}
			
		}
		
		
		
	}
}
