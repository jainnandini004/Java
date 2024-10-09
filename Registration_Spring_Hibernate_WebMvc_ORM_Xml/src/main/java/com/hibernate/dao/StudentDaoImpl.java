package com.hibernate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hibernate.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	 private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}


	public int create(Student stu) {
		
		Integer result = (Integer)template.save(stu);
		System.out.println(stu.getId());
		return result;
	}
}
