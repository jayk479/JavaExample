package com.yedam.test0405;

public class Card {
	String cardNo;
	String vaildDate;
	int cvc;
	
	public Card(String cardNo, String vaildDate, int cvc) {
		this.cardNo = cardNo;
		this.vaildDate = vaildDate;
		this.cvc = cvc;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getVaildDate() {
		return vaildDate;
	}

	public int getCvc() {
		return cvc;
	}
	
	public void ShowCardInfo() {
		System.out.println("Card No : "+ cardNo + ", 유효기간 : " + vaildDate + ", CVC : " + cvc);
	}
	
}
