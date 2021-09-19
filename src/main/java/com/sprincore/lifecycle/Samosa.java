package com.sprincore.lifecycle;

public class Samosa {

public double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("price is set");
	this.price = price;
}

public Samosa(double price) {
	super();
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}

// For initialize
public void init() {
	System.out.println("inside init method");
}

// For Destroy
public void destroy() {
	System.out.println("Outside destroy method");
}

}
