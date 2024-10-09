package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
//@Table(name = "student") this is optional
public class Student {
	
	//customgenerator
	@GenericGenerator(name = "randomid", strategy = "com.hibernate.entity.CustomGenerator")
	@GeneratedValue(generator = "randomid")
	@Id
	// @Column(name = "id") this is optional
	private String id;

	// @Column(name="firstName") this is optional
	private String firstName;

	// @Column(name="lastName") this is optional
	private String lastName;

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//no-arg constructor
	public Student() {

	}

}