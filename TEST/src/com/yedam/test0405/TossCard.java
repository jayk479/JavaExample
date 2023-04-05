package com.yedam.test0405;

public class TossCard extends Card {
	String company = "Toss";
	String cardStaff;
	
	public TossCard() {
		
	}
	public void TossCard(String cardNo, String vaildDate, int cvc) {
		super(cardNo, vaildDate, cvc);
	}

	@Override
	public void ShowCardInfo() {
		System.out.println("카드정보 - Card NO, " +  cardNo);
		System.out.println("담당직원 - " +  cardStaff + ", " + company);
	}
	

	
}
