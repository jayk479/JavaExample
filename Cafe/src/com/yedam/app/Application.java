package com.yedam.app;

import java.util.Scanner;

import com.yedam.coffee.CoffeeService;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	CoffeeService cs = new CoffeeService();
	int menu = 0;
	
	public Application() {
		run();
	}
	
	public void run() {
		System.out.println("1. 메뉴조회 | 2. 메뉴상세조회 | 3. 메뉴등록 | 4. 판매 | 5. 메뉴삭제 | 6. 매출 | 7. 종료");
		System.out.println("메뉴입력> ");
		menu = Integer.parseInt(sc.nextLine());
		
		boolean run = true;
		while(run) {
			if(menu == 1) {
				cs.getCoffeeList();
			}else if(menu == 2) {
				cs.getMenu();
				
			}else if(menu == 3) {
				cs.coffeeAdd();
				
			}else if(menu == 4) {
				cs.updateSales();
				
			}else if(menu == 5) {
				cs.coffeeDelete();
				
			}else if(menu == 6) {
				cs.getCount();
				
			}else if(menu == 7) {
				System.out.println("end of prog");
				run = false;
			}
		}
	}
}
