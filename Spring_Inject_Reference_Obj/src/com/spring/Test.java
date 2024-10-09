package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");

		Student obj = (Student) context.getBean("obj");
		System.out.println(obj);
		/*
		 * System.out.println("city name is : " + obj.getAddress().getCityname());
		 * System.out.println("state name is: " + obj.getAddress().getStatename());
		 * System.out.println("country name is: " + obj.getAddress().getCountryname());
		 */
	}

}
