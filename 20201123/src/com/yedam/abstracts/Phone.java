package com.yedam.abstracts;

public abstract class Phone { //추상클래스
	public String owner;
	public Phone() {
		
	}
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰 전원을 킵니다.");
	}
	
	public abstract void ring();
	public abstract void turnOff();

}
