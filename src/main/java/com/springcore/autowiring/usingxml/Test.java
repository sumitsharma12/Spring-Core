package com.springcore.autowiring.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/usingxml/autoconfig.xml");
		Emp emp1=(Emp)context.getBean("ref");
		System.out.println(emp1);
		
	}

}
