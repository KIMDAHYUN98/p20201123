package com.yedam;

public class CarExample { // 메인 메소드
	public static void main(String[] args) {
		Car c1 = new Car(); // 기본 생성자, 인스턴스 생성 / car 라는 클래스를 타입으로 선언
//		System.out.println(c1.getCompany());// string : null ==> 초기값
//		System.out.println(c1.getMaxSpeed());// int : 0 ==> 초기값

		Car c2 = new Car("현대", "Sonata", "white", 200);
//		System.out.println(c2.getCompany());
//		System.out.println(c2.getMaxSpeed());

		Car c3 = new Car("삼성", "SMS");
		c3.setColor("yellow");
		c3.setMaxSpeed(210);

		Car c4 = new Car("삼성", "SM3");
		c4.setColor("black");
		c4.setMaxSpeed(180);

		Car[] cars = { c1, c2, c3, c4 };
		for (Car car : cars) { // cars의 배열 수 만큼 출력
			if (car != null) {
				if ("삼성".equals(car.getCompany())) {
					System.out.println(car.getModel());
					System.out.println(car.getMaxSpeed());

				}

			}

		}

	}
}
