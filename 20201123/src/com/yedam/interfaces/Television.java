package com.yedam.interfaces;

public class Television implements RemoteControl { // remoteControl를 구현하는 Television 클래스

	@Override
	public void turnOn() {
		System.out.println("TV를 킵니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

}
