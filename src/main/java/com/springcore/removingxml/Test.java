package com.springcore.removingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student1=context.getBean("con",Student.class);
		System.out.println(student1);
		student1.name();
		
		
	}

}
