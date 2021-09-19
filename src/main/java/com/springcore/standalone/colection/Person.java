package com.springcore.standalone.colection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	public List<String>friends;
	public Set<String>works;
	public Map<Integer, String>Salary;
	public Properties address;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<String> getWorks() {
		return works;
	}
	public void setWorks(Set<String> works) {
		this.works = works;
	}
	public Map<Integer, String> getSalary() {
		return Salary;
	}
	public void setSalary(Map<Integer, String> salary) {
		Salary = salary;
	}
	public Properties getAddress() {
		return address;
	}
	public void setAddress(Properties address) {
		this.address = address;
	}
	public Person(List<String> friends, Set<String> works, Map<Integer, String> salary, Properties address) {
		super();
		this.friends = friends;
		this.works = works;
		Salary = salary;
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", works=" + works + ", Salary=" + Salary + ", address=" + address + "]";
	}
	
	

	
	
	
}
