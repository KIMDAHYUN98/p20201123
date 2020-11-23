package com.yedam;

import java.io.IOException;

public class StringExample {
	public static void main(String[] args) {
		String str1 = new String();
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str2 = new String(bytes);
		System.out.println(str2.toString());
		//실행 결과 : Hello Java, bytes 배열 값들이 문자열...?
		
		String str3 = new String(bytes, 6, 4); //인덱스 위치가 6번째 부터 4자리 출력
		System.out.println(str3.toString());
		
		byte[] bytes2 = new byte[100]; //byte 배열을 100개 선언
//		try {
//			int readByteNo = System.in.read(bytes2);
//			String str4 = new String(bytes2, 0, readByteNo);
//			System.out.println(str4);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
		
		char chr = str2.charAt(0);
		System.out.println(chr);
	}

}
