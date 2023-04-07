package com.yedam.app;

import java.util.Scanner;

import com.yedam.account.AccountService;
import com.yedam.customer.CustomerService;

public class ManageMent {
	
	int menu = 0;
	CustomerService cs = new CustomerService();
	AccountService as = new AccountService();
	Scanner sc = new Scanner(System.in);
	public ManageMent() {
		bankJob();
	}
	
	private void bankJob() {
		while(true) {
			menu();
			if(CustomerService.customerInfo.getCustomerGrade().equals("C")) {
				if(menu ==1) {
					as.getAccount();
				}else if(menu == 2) {
					as.updateMoney();
				}else if(menu == 3) {
					
				}else if(menu == 4) {
					cs.logout();
				}
			}else if(CustomerService.customerInfo.getCustomerGrade().equals("B")){
				if(menu ==1) {
					cs.customerAdd();
				}else if(menu == 2) {
					as.accountAdd();
				}else if(menu == 3) {
					as.accountDelete();
				}else if(menu == 4) {
					cs.logout();
				}
			}
		}		
	}
	
	private void menu() {	
		if(CustomerService.customerInfo.getCustomerGrade().equals("C")) {
		System.out.println("1. 계좌조회 | 2. 입, 출금 | 3. 계좌이체 | 4. 로그아웃");
		}else if(CustomerService.customerInfo.getCustomerGrade().equals("B")) {
		System.out.println("1. 고객등록 | 2. 계좌개설 | 3. 계좌해지 | 4. 로그아웃");
		}
		System.out.println("입력> ");
		menu = Integer.parseInt(sc.nextLine());
	}
}
