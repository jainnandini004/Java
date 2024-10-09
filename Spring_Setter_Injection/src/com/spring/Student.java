package com.spring;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	Student()
	{
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Student["+" ID: "+id+" Name: "+name+ "]";
	}
	

}
