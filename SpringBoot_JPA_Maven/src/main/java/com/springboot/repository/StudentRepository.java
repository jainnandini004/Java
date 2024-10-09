package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.bean.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{


//	public Student findByLastname(String lastName);
	public Student findByFirstname(String firstName);
//	public Student findByFirstnameOrid(String firstName,int stid);
}
