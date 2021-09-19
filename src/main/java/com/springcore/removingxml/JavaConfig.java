package com.springcore.removingxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"temp","con"})
	public Student getStudent() {
		Student student1=new Student(getSamosa());
		return student1;
	}
	
	
}
