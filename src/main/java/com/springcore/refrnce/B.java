package com.springcore.refrnce;

public class B {

	private int y;

	
	
//	Generate Getter and Setter
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	
	
//	Generate constructor
	
	public B(int y) {
		super();
		this.y = y;
	}

	
	
//	Generate constructor super class
	
	
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
//	Generate to string
	
	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}
	
}
	