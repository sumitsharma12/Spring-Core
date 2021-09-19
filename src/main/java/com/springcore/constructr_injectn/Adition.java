package com.springcore.constructr_injectn;

public class Adition {
private int  a;
private int b;

public Adition(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("constructor :int , int");
}

public Adition(double a,double b) {
	this.a=(int) a;
	this.b=(int) b;
	System.out.println("constructor :double , double");
}

public Adition(String a,String b) {
	this.a=Integer.parseInt(a);
	this.b=Integer.parseInt(b);
	System.out.println("constructor :String , String");
	
}


public void sum() {
	System.out.println("value of a is "+this.a);
	System.out.println("value of b is "+this.b);
	System.out.println("sum is "+(this.a+this.b));
}


}
