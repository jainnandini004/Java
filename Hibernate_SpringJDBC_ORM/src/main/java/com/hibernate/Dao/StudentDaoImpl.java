package com.hibernate.Dao;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.entity.Student;

public class StudentDaoImpl implements StudentDao {
//Spring Jdbc + Hibernate
	@Autowired
	private HibernateTemplate template;
	
	public HibernateTemplate getTemplate()
	{
		return template;
	}
	
	public void setTemplate(HibernateTemplate template)
	{
		this.template=template;
	}
	
	@Transactional
	public int saveStudent(Student student)
	{
		Integer result=(Integer)template.save(student);
		return result;
	}
	
	@Transactional
	public void update(Student student)
	{
		template.update(student);
	}
	
	@Transactional
	public void delete (Student student)
	{
		template.delete(student);
	}
	
	}
