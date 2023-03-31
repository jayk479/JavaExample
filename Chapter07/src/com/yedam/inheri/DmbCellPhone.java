package com.yedam.inheri;

public class DmbCellPhone extends CellPhone{

	
	// 자식클래스
	
	//필드
	int channel;
	
	
	
	//생성자
	public DmbCellPhone(int channel, String color, String model) {
		// super() : 부모클래스에 있는 생성자를 사용하는 키워드
		super(model, color);
		this.channel = channel;
		
	}
	
	
	//메소드
	public void turenOnDmb() {
		System.out.println("채널" + channel + "번 DMB방송 수신");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB방송수신을멈춥니다.");
		
	}
}
