package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;

public class EmployeeAfterAspect {
	@After("execution(* com.spring.*.*())")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("Running After Advice");
	}

	@AfterThrowing("execution(* com.spring.*.*())")
	public void afterThrowingAdvice(JoinPoint joinPoint) {
		System.out.println("Running After Throwing Advice means Exception thrown in Employee Method");
	}

	@AfterReturning("execution(* com.spring.*.*())")
	public void afterReturningAdvice(JoinPoint joinPoint) {
		System.out.println("After Returning Advice executed");
	}
}
