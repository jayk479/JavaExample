package com.yedam.test0405;

public class SimplePayment implements Payment{
	
	public double SimplePayment;

	@Override
	public int online(int price) {
		return (int) (price*SimplePayment);
	}

	@Override
	public int offline(int price) {
		return (int) (price*SimplePayment);
	}

	@Override
	public void showInfo() {
		
		
	}

}
