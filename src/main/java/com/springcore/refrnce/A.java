package com.springcore.refrnce;

public class A {

	private int x;
	private B ob;
	
//	Generate Getter and Setter
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	
//	Generate constructor
	public A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	
//	Generate constructor super class
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	Generate to string
	
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	
	
}
