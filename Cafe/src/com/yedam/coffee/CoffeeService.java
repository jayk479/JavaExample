package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	Scanner sc = new Scanner(System.in);

	public void getCoffeeList() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffeeList();
		for(Coffee coffee : list) {
			System.out.print("메뉴 : " + coffee.getCoffeeMenu() + "\t");
			System.out.println("가격 : " + coffee.getCoffeePrice());
		}
	}
	
	public void getMenu() {
		System.out.println("메뉴입력> ");
		String menu = sc.nextLine();
		Coffee coffee = CoffeeDAO.getInstance().getMenu(menu);
		System.out.println("메뉴 : " + coffee.getCoffeeMenu() + " 가격 : " + coffee.getCoffeePrice() + " 설명 : " + coffee.getCoffeeExplain());	
//		if(menu.equals(CoffeeDAO.getCoffeeMenu())) {
//		}else {
//			System.out.println("해당메뉴없음");
//		}
	}
	
	public void coffeeAdd() {
		System.out.println("메뉴입력> ");
		String coffeeMenu = sc.nextLine();
		System.out.println("가격입력> ");
		int coffeePrice = Integer.parseInt(sc.nextLine());
		System.out.println("설명입력> ");
		String coffeeExplain = sc.nextLine();
		
		Coffee coffee = new Coffee();
		
		coffee.setCoffeeMenu(coffeeMenu);
		coffee.setCoffeePrice(coffeePrice);
		coffee.setCoffeeExplain(coffeeExplain);
		
		int result = CoffeeDAO.getInstance().coffeeAdd(coffee);
		
		if(result == 1) {
			System.out.println("메뉴등록완료");
		}else {
			System.out.println("메뉴등록실패");
		}
	}              
	
	public void coffeeDelete() {
		System.out.println("메뉴입력> ");
		String coffeeMenu = sc.nextLine();
		int result = CoffeeDAO.getInstance().coffeeDelete(coffeeMenu);
		if(result > 0) {
			System.out.println("메뉴삭제완료");
		}else {
			System.out.println("메뉴삭제실패");
		}
		
	}
	
	public void updateSales() {
		
		System.out.println("메뉴입력> ");
		String coffeeMenu = sc.nextLine();
		int result = CoffeeDAO.getInstance().updateSales(coffeeMenu);
		
		if(result > 0) {
			System.out.println("판매량완료");
		}else {
			System.out.println("아님");
		}
	}
	
	public void getCount() {
		List<Coffee> list = CoffeeDAO.getInstance().getCount();
		for(Coffee coffee : list) {
			System.out.print("메뉴 : " + coffee.getCoffeeMenu()+" 판매갯수 : " + coffee.getCoffeeSales()+" 판매금액 : " + (coffee.getCoffeePrice()*coffee.getCoffeeSales()));
		}
		
	}
	
}
