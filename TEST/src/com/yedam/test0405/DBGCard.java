package com.yedam.test0405;

public class DBGCard extends Card{
//여기안됨
	public DBGCard(String cardNo, String vaildDate, int cvc) {
		super(cardNo, vaildDate, cvc);
		// TODO Auto-generated constructor stub
	}


	String company = "대구은행";
	String cardStaff;
	
	
	@Override
	public void ShowCardInfo() {
		System.out.println("카드정보 (Card No : " + cardNo + ", 유효기간 : " + vaildDate + ", CVC: " + cvc +")");
		System.out.println("담당지구언 - " + cardStaff +", " + company);
	}

}
