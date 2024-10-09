//Constructor based Injection Demo

package com.Spring;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
//here only constructor present
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	Student() {
	}

	@Override
	public String toString() {
		return "Student[stid=" + id + ", stname=" + name + "]";
	}
}
