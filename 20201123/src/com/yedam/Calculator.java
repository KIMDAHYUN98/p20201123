package com.yedam;

public class Calculator {
	
	private String color;
	static double pi = 3.14;
	
	public void setColor(String color) {
		this.color = color; //  set 메소드로 필드값을 담을 수 있다
	}

	public static int plus(int a, int b) {
		return a + b; // plus : 메소드
		
	}
	public static int minus(int a, int b) {
		return a - b;
	}
}
