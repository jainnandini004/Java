package com.spring;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*Directly we can write Student obj = (Student) context.getBean("student") it, by using component annotation ;*/

//In auto discovery we use @component and @autowired annotation and free from bean declaration and bean autowiring.

//@Component allow the spring to automatically  detect our custom bean
//Spring will Scan our application for classes annotated with @Component and Instantiate them means create object with class name bt start with small letter.

@Component
public class Student implements Serializable {

	@Autowired
	private Address address;

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
