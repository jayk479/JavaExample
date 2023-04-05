package com.yedam.test0405;

public class CardPayment implements Payment{
	public double cardRatio;

	public CardPayment() {
		 
	}
	@Override
	public int online(int price) {
		return (int) (price*cardRatio);
	}

	@Override
	public int offline(int price) {
		return (int) (price*cardRatio);
	}

	@Override
	public void showInfo() {
		System.out.println();
		
	}

}
