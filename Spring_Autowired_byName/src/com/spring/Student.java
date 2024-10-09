package com.spring;

import java.io.Serializable;
//here no need to write @Autowired as here we use xml configuration file
public class Student implements Serializable{
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

	
	}
	
