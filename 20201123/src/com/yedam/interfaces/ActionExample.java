package com.yedam.interfaces;

public class ActionExample {
	public static void main(String[] args) {

		Action action = new Action() {

			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work(); // 복사 익명으로 선언

		action = () -> {
			System.out.println("운전을 합니다.");
		};
		
		action.work(); // 운전
		
	}

}
