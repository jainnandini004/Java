package com.spring.entity;


public class Employee {

	private String employeeName;
	
	public void throwException()
	{
		throw new RuntimeException("DummyException");
	}
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}