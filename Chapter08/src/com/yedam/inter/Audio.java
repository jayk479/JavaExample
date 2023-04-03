package com.yedam.inter;

public class Audio implements RemoteControl {

	// Audio volume 측정하기 위한 변수
	
	private int voluem;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");			
	}

	@Override
	public void setVolume(int volume) {
		if(voluem > RemoteControl.MAX_VOLUME) {
			this.voluem = RemoteControl.MAX_VOLUME;
		}else if(voluem < RemoteControl.MIN_VOLUME){
			this.voluem = RemoteControl.MIN_VOLUME;
		}else {
			this.voluem = voluem;
		}
		System.out.println("현재 오디오 볼륨 : " + this.voluem);		
		}

}
