package com.spring.aspect;

import org.aspectj.lang.annotation.Around;

public class EmployeeAroundAspect {
	@Around("execution(* com.spring.entity.getName())")
	public void BeforAdvice(){
		System.out.println("Execute Around Aspect Advice");
	}
}

