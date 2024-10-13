package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Always we have to write this below line in the Spring
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");

		Employee e = (Employee) context.getBean("employee");
		e.throwException();

	}
}
