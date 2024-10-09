package com.spring;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

	// Normal Variable
	private int id;
	private String name;

	// List Collection Variable
	private List<String> subjects;

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

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [stid=" + id + ", stname=" + name + ", subjects=" + subjects + "]";
	}

}
