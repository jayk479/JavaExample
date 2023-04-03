package com.yedam.inter;

public class SmartTelevision implements RemoteControl, Searchable{
	
	private int voluem;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");	
	}

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


}
