package com.hibernate.Dao;

import org.springframework.transaction.annotation.Transactional;

import com.hibernate.entity.Student;

public interface StudentDao {
	
	int saveStudent(Student student);//Abstract Method
	
	void update(Student student);
	
	void delete(Student student);

}
