package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Student obj = new Student();

				// obj.display();

				ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");

				Student obj = (Student) context.getBean("obj");
				System.out.println(obj);//call toString() method
	}

}
