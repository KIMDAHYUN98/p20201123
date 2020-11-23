package com.yedam;

public class StudentExample {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setUni("YNU");
		s1.setStuNo(1234);
		s1.setMajor("경제");
		s1.setName("김다현");
		
		Student s2 = new Student("GMU", 151234, "간호학과", "B");
		s2.setUni("서울대");
		s2.setStuNo(1234);
		s2.setMajor("컴공");
		s2.setName("이혜빈");

		s2.showStudentInfo();
		
		
		Student s3 = new Student("KBU", 153245);
		s3.setMajor("경영학");
		s3.setName("C");
		s3.showStudentInfo();
		
		
	}

			
		
	}

