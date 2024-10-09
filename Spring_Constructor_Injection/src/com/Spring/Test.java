//Constructor based Injection Demo

package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// Student obj = new Student();

		// obj.display();

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");

		Student obj = (Student) context.getBean("obj");
		System.out.println(obj);

	}

}