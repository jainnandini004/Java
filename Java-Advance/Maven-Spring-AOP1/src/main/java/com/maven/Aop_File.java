package com.maven;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * @Aspect this annotation is placed upon the AOP file
 * Spring AOP used to seperate the main logic and secondary logic
 * Some of the common crosscutting concerns are logging, transaction management, data validation, etc.
 */

/*
In Object Oriented Programming, modularity of application is achieved by Classes whereas in Aspect
Oriented Programming application modularity is achieved by Aspects and they are configured to cut across different classes.
*/
@Aspect
public class Aop_File {
	
	
	@After("execution(* com.maven.*.*())")
	public void myadvice(JoinPoint jp)//it is advice
	{
		System.out.println("additional concern");
	}

}
