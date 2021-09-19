package com.springcore;

public class Student {

	private String studentName;
	private int studentRollNo;
	private String studentAdresss;
	
	//Generating Getter and Setter
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentAdresss() {
		return studentAdresss;
	}
	public void setStudentAdresss(String studentAdresss) {
		this.studentAdresss = studentAdresss;
	}
	
	
	
//	Generating Constructor using field
	public Student(String studentName, int studentRollNo, String studentAdresss)
	{
		super();
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentAdresss = studentAdresss;
	}
	
//	Generating constructor using super class
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	Generating toString
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNo=" + studentRollNo + ", studentAdresss="
				+ studentAdresss + "]";
	}
	
}
