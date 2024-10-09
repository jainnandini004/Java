package com.spring;

import java.io.Serializable;

public class Student implements Serializable {
	// here no need to write @Autowired as here we use xml configuration file
	private Address address;

	// Only Constructor required
	public Student(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
