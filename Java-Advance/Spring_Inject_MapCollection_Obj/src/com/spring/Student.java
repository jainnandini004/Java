package com.spring;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student implements Serializable {
	// Normal Variable
	private int id;
	private String name;

	// Map collection variable
	private Map<String, String> subjects;

	// getter and setter
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

	public Map<String, String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String, String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [stid=" + id + ", stname=" + name + ", subjects=" + subjects + "]";
	}

}
