package com.yedam.inter;

public class Television implements RemoteControl {
	
	private int voluem;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(voluem > RemoteControl.MAX_VOLUME) {
			this.voluem = RemoteControl.MAX_VOLUME;
		}else if(voluem < RemoteControl.MIN_VOLUME) {
			this.voluem = RemoteControl.MIN_VOLUME;
		}else {
			this.voluem = voluem;
		}
		System.out.println("현재 TV 볼륨 : " + this.voluem);		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
