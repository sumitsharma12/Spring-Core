package com.springcore.standalone.colection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/colection/standconfig.xml");
Person all=(Person)context.getBean("total");
System.out.println(all.getFriends());
System.out.println(all.getFriends().getClass().getName());
System.out.println(all.getWorks());
System.out.println(all.getWorks().getClass().getName());
System.out.println(all.getSalary());
System.out.println(all.getSalary().getClass().getName());
System.out.println(all.getAddress());
System.out.println(all.getAddress().getClass().getName());

	}

}
