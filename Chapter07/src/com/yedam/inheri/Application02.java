package com.yedam.inheri;

public class Application02 {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone();
		
		//부모클래스메소드사용
		
		dmb.powerOn();
		dmb.powerOff();
		dmb.bell();
		dmb.hangUp();
		
		//자식클래스 메소드 사용
		
		dmb.turenOnDmb();
		dmb.turnOffDmb();

	}

}
