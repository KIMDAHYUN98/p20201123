package com.yedam.string;

public class StringEqualsExample {
	public static void main(String[] args) {
		String StrVal1 = new String("김다현");
		String StrVal2 = "김다현";
		
		if(StrVal1 == StrVal2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		} // 주소값을 비교
		
		if(StrVal1.equals(StrVal2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
