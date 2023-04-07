package com.yedam.account;

import java.util.Scanner;

public class AccountService {
	Scanner sc = new Scanner(System.in);
	
	public void accountAdd() {
		
		System.out.println("계좌번호> ");
		int accountId = Integer.parseInt(sc.nextLine());
		System.out.println("고객ID> ");
		int customerId = Integer.parseInt(sc.nextLine());
		System.out.println("최초입금액> ");
		int money = Integer.parseInt(sc.nextLine());

		Account account = new Account();
		account.setAccountId(accountId);
		account.setCustomerId(customerId);
		account.setBalance(money);
		
		int result = AccountDAO.getInstance().accountAdd(account);
		
		if(result == 1) {
			System.out.println("계좌개설성공");
		}else {
			System.out.println("계좌개설실패");
		}
	}
	
	public void accountDelete() {
		 System.out.println("계좌번호> ");
		 int accountId = Integer.parseInt(sc.nextLine());
		 
		 int result = AccountDAO.getInstance().accountDelete(accountId);
		 
		 if(result > 0) {
			 System.out.println("계좌해지완로");
		 }else {
			 System.out.println("계좌해지실패");
		 }
	}
	
	public void getAccount() {
		Account account = AccountDAO.getInstance().getAccount();
		System.out.println(account.toString());
		System.out.println("계좌번호 : " + account.getAccountId());
		System.out.println("잔액 : " + account.getBalance());
	}
	
	public void updateMoney() {
		System.out.println("1. 입금 | 2. 출금");
		int cmd = Integer.parseInt(sc.nextLine());
		
		System.out.println("계좌번호> ");
		int accountId = Integer.parseInt(sc.nextLine());
		
		if(cmd == 1) {
			System.out.println("입금금액> ");
		}else if(cmd == 2) {
			System.out.println("출금금액> ");	
		}
		
		int money = Integer.parseInt(sc.nextLine());
		
		Account account = new Account();
		
		account.setAccountId(accountId);
		account.setBalance(money);
		
		int result = AccountDAO.getInstance().updateMoney(account, cmd);
		
		if(result == 1 && cmd == 1) {
			System.out.println("입금완료");
		}else if(result == 1 && cmd == 2) {
			System.out.println("출금완료");
		}else {
			System.out.println("실패");
		}
	}

}
