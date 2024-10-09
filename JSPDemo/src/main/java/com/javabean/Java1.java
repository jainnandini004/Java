//used by JavaBean1 and JavaBean2 JSP File

package com.javabean;

import java.io.Serializable;

public class Java1 implements Serializable{
	private int id;
	private String name;
	private String email;

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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
