package com.yedam;

public class CalExample {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(); // --> 인스턴스 생성, 생성자 호출
		c1.setColor("white");
		
		// c1.plus(3,5); -- 오류발생 
		// set method 는 인스턴스(=c1)를 생성해서 호출해야하는데
		// plus는 static으로 인해 인스턴스를 따로 생성하지 않아도 된다.
		
		int result = Calculator.plus(3,5);
		System.out.println(result);
		result = Calculator.minus(10, 5);
		System.out.println(result);

		System.out.println(Calculator.pi);
		// static의 유무로 인스턴스의 생성유무를 결정한다
		
		CalExample ce1 = new CalExample();
//		result = ce1.sum(3, 5); // static 방식으로 메소드 호출하는 것을 권장
		
	}
	
	public static int sum(int a, int b) { //static : 인스턴스를 따로 생성하지 않고 클래스 이름으로 바로 호출가능
		return a + b; // 
	}
	
}
