package com.springcore.springbeanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.springbeanscope.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/springbeanscope/springbeanconfig.xml");
		
		Student stu=context.getBean("ob",Student.class);
		System.out.println(stu.hashCode());
		Student stu2=context.getBean("ob",Student.class);
		System.out.println(stu2.hashCode());
		
		
//		Teacher t1=context.getBean("teachers",Teacher.class);
//		Teacher t2=context.getBean("teachers",Teacher.class);
//		System.out.println(t1.hashCode());
//		System.out.println(t2.hashCode());
	}

}
