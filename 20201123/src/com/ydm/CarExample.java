package com.ydm;

import com.yedam.Car;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car(); // 동일한 패키지 아닐 경우 접근 불가능 => class에서 public 선언(생성자, 메소드)
		
		Car c2 = new Car("현대");
		
		Car c3 = new Car("삼성", "SMS");
		
	}

}
