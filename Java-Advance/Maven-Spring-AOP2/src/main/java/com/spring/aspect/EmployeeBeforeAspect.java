package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

public class EmployeeBeforeAspect {
	@Before("execution(public String getName())")
	public void BeforAdvice(){
		System.out.println("Execute Before Aspect Advice");
	}
	
}
