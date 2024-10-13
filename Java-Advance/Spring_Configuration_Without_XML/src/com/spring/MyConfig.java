package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	/* Method to providing object with out use of bean and without XML file */
	@Bean("stu")
	public Student getStudent()
	{
		return new Student();
	}
	

}
