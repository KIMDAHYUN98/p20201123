package com.yedam;

public class Student {
	String uni;
	int stuNo;
	String name;
	String major;

	// Constructor

	Student(){
		
	}
	
	Student(String uni, int StuNo) {
		this.uni = uni;
		this.stuNo = StuNo;
	}
	
	Student(String uni, int StuNo, String name, String major){
		this.uni = uni;
		this.stuNo = StuNo;
		this.name = name;
		this.major = major;
	}

	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void showStudentInfo() {
		System.out.println("학교 : " + uni + " 학번 : " + stuNo + " 이름 :" + name );
	}
	
//
//	
//	
//		
//	
}
