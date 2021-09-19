package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{11+22}")
	public int x;
	
	@Value("#{41-22}")
	public int y;
	
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	public double z;
	
	@Value("#{T(java.lang.Math).E}")
	public double e;
	
//	@Value("sumit sharma")
//	or
	@Value("#{new java.lang.String('sumit sharma')}")
	public String name;
	
	@Value("#{8>4}")
	public boolean isActive;
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", check=" + isActive + "]";
	}
	
	
		
	
	
}
