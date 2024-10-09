package com.hibernate.service;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.hibernate.dao.StudentDao;
import com.hibernate.entity.Student;

@Service
public class ServiceImpl implements ServiceInterface {

	 @Autowired
	 private StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	
	
	@Transactional
	public int save(Student stu) {
		//business logic
		return dao.create(stu);
	}

}
