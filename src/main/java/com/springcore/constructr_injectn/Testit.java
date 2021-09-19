package com.springcore.constructr_injectn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testit {

	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructr_injectn/constrctrconfig.xml");
		Person p=(Person)context.getBean("person");
		System.out.println(p);
		
		Adition total = (Adition)context.getBean("add");
		total.sum();
	}
}
