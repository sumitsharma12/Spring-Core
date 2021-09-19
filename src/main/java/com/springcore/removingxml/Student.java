package com.springcore.removingxml;


public class Student {


	
	public Samosa detail;

	public void name() {
		this.detail.display();
		System.out.println("My name is sumit sharma");
	
	}
	
	public Samosa getDetail() {
		return detail;
	}

	public void setDetail(Samosa detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Student [detail=" + detail + "]";
	}

	public Student(Samosa detail) {
		super();
		this.detail = detail;
	}
	


	
	
}
