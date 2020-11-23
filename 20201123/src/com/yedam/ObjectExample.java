package com.yedam;
import java.util.Scanner;

public class ObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		Object o1 = new Object();
//		boolean sameOrDiff = o1.equals(new Object()); //o1과 Object 를 비교, boolean 타입 리턴
		//실행결과 : false, because : new Object 를 새로 선언
		boolean sameOrDiff = o1.equals("Hello"); 
		System.out.println(sameOrDiff);
		
		System.out.println(o1.toString());
	}

}
