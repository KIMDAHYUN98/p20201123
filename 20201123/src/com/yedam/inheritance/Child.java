package com.yedam.inheritance;

public class Child extends Parent { //extend 뒤에 상속받고 싶은 클래스를 정의
	
	String field2;
	
	public Child() {
		super();
	}
	
	public Child (String field1, String field2) {
		super(field1); // 부모클래스가 가지고 있는 생성자를 호출해서 필드를 채우겠다.
		this.field2 = field2;
	}

	public void method2() {
		super.method1(); // 부모가지고 있는 메소드1을 호출해 메소드2 로 출력하겠다
		System.out.println("method2() 호출."); // Child 클래스가 가지고 있는 필드
	}
}
