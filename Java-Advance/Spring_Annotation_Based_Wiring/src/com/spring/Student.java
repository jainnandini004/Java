package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	/*
	 * Use @autowired to access the reference variable, without getter or setter we
	 * directly set the value of address class variable like cityname, statename,
	 * countryname. We have to place this annotation above reference variable.
	 */

	@Autowired
	private Address address;

	/*
	 * No need of Getter Setter now-
	 * 
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
