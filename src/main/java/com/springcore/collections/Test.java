package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

public class Test {
	

	public static void main (String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/employee_config.xml");	
		Employee emps=(Employee)context.getBean("emp1");
		System.out.println(emps.getName());
		System.out.println(emps.getPhones());
		System.out.println(emps.getAddress());
		System.out.println(emps.getCourses());
		System.out.println(emps.getProps());
		
		
	}



}
