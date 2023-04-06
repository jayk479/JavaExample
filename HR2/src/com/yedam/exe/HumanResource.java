package com.yedam.exe;

import java.util.Scanner;
import com.yedam.employees.EmpImpl;

public class HumanResource {

	EmpImpl ei = new EmpImpl();
	Scanner sc = new Scanner(System.in);
	
	public HumanResource() {
		run();
	}
	
	private void run() {
		// 메뉴 - 기능
		// 1) 로그인
		// 2) 회원가입
		// 3) 등급 관리
		
		while (true) {
			System.out.println("1. 사원관련 | 2. 부서관련 | 99. 종료");
			System.out.println("메뉴> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				// 1. 새로운 클래스 생성
				// 2. HumanResource에 다 때려넣어서 하기ㅇㅇ
				employees();
			}else if(menu == 2) {
				departments();
			}else if(menu == 99) {
				System.out.println("프로그램종료");
				break;
			}
		}		
	}
	
	private void employees() {
		int menu = 0;
		while(menu != 99) {
			System.out.println("1. 전체조회 | 2. 사번조회 | 3. 사원등록 | 4. 급여수정 | 5. 사원삭제 | 99. 돌아가기");
			System.out.println("메뉴> ");
			menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				ei.getEmployeesList();					
			}if(menu == 2) {
				ei.getEmployee();
			}else if(menu == 3) {
				ei.empAdd();
			}else if(menu == 4) {
				ei.empUpdate();		
			}else if(menu == 5) {
				ei.empDelete();
			}
		}
	}
	
	private void departments() {
		int menu = 0;
		boolean flag = true;
		while(flag) {
			System.out.println(" 1.전체부서조회 | 2. 부서정보조회 | 3. 부서추가 | 4. 부서수정 | 5. 부서삭제 | 99. 돌아가기");
			System.out.println("메뉴> ");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				ei.getDepartmentList();
			}else if(menu == 2) {
				ei.getDepartment();
			}else if(menu == 3) {
				 ei.depAdd();
			}else if(menu == 4) {
				 ei.depUpdate();
			}else if(menu == 5) {
				 ei.depDelete();
			}else if(menu == 99) {
				flag = false;
			}
		}
	}
}
