package com.sprincore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/sprincore/lifecycle/cc.xml");
		Samosa ss=(Samosa)context.getBean("s1");
		System.out.println(ss);
		
		// registering shutdown hook
		
		context.registerShutdownHook();
	}

}
