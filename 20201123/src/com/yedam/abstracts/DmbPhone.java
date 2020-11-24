package com.yedam.abstracts;

public class DmbPhone extends Phone {

	@Override
	public void ring() {
		System.out.println("Dmb폰 벨...");
		
	}

	@Override // 재정의
	public void turnOff() {
		
	}

}
