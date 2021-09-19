package com.springcore.constructr_injectn;

import java.util.List;

public class Person {

	
	private String name;
	private int rollno;
	private Certi certi;
	private List<String> list;
	public Person(String name,int rollno,Certi certi,List<String>list) {
		this.name=name;
		this.rollno=rollno;
		this.certi=certi;
		this.list=list;
	}
	
	@Override
	public String toString() {
		return this.name+" : "+this.rollno+""+this.certi.name+""+this.list;
	}
}		
