package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.TeacherEntity;
import com.springboot.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;

	// SAVE-----------------------------------------------
	public TeacherEntity save(TeacherEntity teacher) {
		return teacherRepository.save(teacher);
	}
	
	// DELETE BY ID----------------------------------------
		public void deleteById(int id) {
			teacherRepository.deleteById(id);
		}
		// UPDATE
		public TeacherEntity update(TeacherEntity teacher, int id) {
			TeacherEntity teacher1 = teacherRepository.findById(id).get();//get method used to taken out row
			teacher1.setName(teacher.getName());
			teacher1.setSubject(teacher.getSubject());
			return teacherRepository.save(teacher1);
		}
	// FETCH ALL------------------------------------------
	public List<TeacherEntity> fetchAll() {
		return teacherRepository.findAll();
	}

	
	// FETCH BY ID-------------------------------------------
	public TeacherEntity fetchById(int id) {
		return teacherRepository.findById(id).get();
	}

	

}
