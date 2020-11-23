package com.yedam.inheritance;

public class InheriExample {
	public static void main(String[] args) {

		Parent p1 = new Parent("필드값1");
		System.out.println(p1.field1);
		p1.method1();
		
		Child c1 = new Child("자식필드1", "자식필드2");
		System.out.println(c1.field2);
		System.out.println(c1.field1);
		c1.method1();
		c1.method2(); 
		
		NewChild nc1 = new NewChild("또 다른 자식1", "또 다른 자식3");
		System.out.println(nc1.field1);
		System.out.println(nc1.field3);
		nc1.method1();
		nc1.method3();
		
		GrandChild gc1 = new GrandChild();
		System.out.println(gc1.field1);
		System.out.println(gc1.field2);
		gc1.method1();
		gc1.method2();
		
		Parent p = new Parent(); // 부모 클래스가 제일 크고, 상위에 있다
		p = new Child();
		p = new GrandChild();
		
//		Child c = new Parent(); ==> 오류발생
		
		
//		long > int > short > byte;
		
		
		
		
	}

}
