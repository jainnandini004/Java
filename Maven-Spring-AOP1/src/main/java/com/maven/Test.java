package com.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//Always we have to write this below line in the Spring 
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");

		Operation op = (Operation) context.getBean("op");

		op.m1();
		op.n1();
		op.p1();
	}
}