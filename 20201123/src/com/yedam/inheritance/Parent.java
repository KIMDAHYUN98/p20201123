package com.yedam.inheritance;

public class Parent {
	
	// 필드
	String field1; 
	
	public Parent() {
		
	}

	
	// 생성자
	public Parent(String field1) {
		this.field1 = field1;

	}

	// 메소드
	public void method1() {
		System.out.println("Parent method1() 호출.");
	}
}
