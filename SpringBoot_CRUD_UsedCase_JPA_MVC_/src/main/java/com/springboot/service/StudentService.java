package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	/*---------------------------- Extract Existing Student------------------------------------------*/

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	/*---------------------- Extract Existing Student by Id------------------------------------------*/

	public Optional<Student> findById(int id) {
		return studentRepository.findById(id);
	}

	/*-------------------------- Save Student------------------------------------------*/

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	/*-------------------------- Update Student------------------------------------------*/

	public Student updateStudent(int id, Student student) {
		Student updatedStudent = studentRepository.findById(id).orElse(null);
		updatedStudent.setName(student.getName());
		updatedStudent.setClass_no(student.getClass_no());
		updatedStudent.setMarks(student.getMarks());

		return studentRepository.save(updatedStudent);
	}

	/*--------------------------Delete Student------------------------------------------*/
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}
}
