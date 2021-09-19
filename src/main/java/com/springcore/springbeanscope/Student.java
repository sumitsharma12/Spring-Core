package com.springcore.springbeanscope;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("ob")
@Scope("prototype")
public class Student {
	@Value("sumit sharma")
	public String name;
	@Value("Greater Noida")
	public String city;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" +" ]";
	}
	
	
}
