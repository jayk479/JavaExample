package com.yedam.customer;

import java.util.Scanner;

public class CustomerService {
	
	public static Customer customerInfo = null;
	//로그인 정보
	
	Scanner sc = new Scanner(System.in);
	//로긍
	public void login() {
		Customer customer = new Customer();
		System.out.println("ID> ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("PW> ");
		String pw = sc.nextLine();
		
		customer = CustomerDAO.getInstacne().login(id);
		
		if(customer != null) {
			if(pw.equals(customer.getCustomerPw())) {
				System.out.println("로그인성공");
				customerInfo = customer;
				
			}else{
				System.out.println("패스워드오류");
			}
		}else {
			System.out.println("아이디오류");
		}
		
		
	}
	
	public void logout() {
		if(customerInfo != null) {
			customerInfo = null;
			System.out.println("로그아웃되었습니다.");
		}
	}
	
	public void customerAdd() {
		System.out.println("id> ");
		int customerId = Integer.parseInt(sc.nextLine());
		System.out.println("pw> ");
		String customerPw = sc.nextLine();
		System.out.println("이름> ");
		String customerName = sc.nextLine();
		
		Customer customer = new Customer();
		
		customer.setCustomerId(customerId);
		customer.setCustomerPw(customerPw);
		customer.setCustomerName(customerName);
		
		CustomerDAO.getInstacne().customerAdd(customer);
		
	}
}
