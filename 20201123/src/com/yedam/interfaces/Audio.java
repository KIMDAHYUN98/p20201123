package com.yedam.interfaces;

public class Audio implements RemoteControl { //remoteControl를 구현하는 Audio 클래스

	@Override
	public void turnOn() {
	
		System.out.println("오디오를 킵니다.");
		
	}

	@Override
	public void turnOff() {

		System.out.println("오디오를 끕니다.");
		
	} //

}
