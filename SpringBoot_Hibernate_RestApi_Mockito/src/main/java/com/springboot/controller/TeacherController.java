package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.TeacherEntity;
import com.springboot.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	// SAVE------------------------------------------------------------------------------------------
	@PostMapping("/insert")
	public TeacherEntity save(@RequestBody TeacherEntity teacher) {
		return teacherService.save(teacher);
	}

	// DELETE----------------------------------------------------------------------------------------
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") int id) {
		teacherService.deleteById(id);
		return "Teacher having id = " + id + " delete successfully";
	}

	// UPDATE----------------------------------------------------------------------------------------
	@PutMapping("/update/{id}")
	public TeacherEntity update(@PathVariable("id") int id, @RequestBody TeacherEntity teacher) {
		return teacherService.update(teacher, id);
	}

	// FETCH BY
	// ID---------------------------------------------------------------------------------------------
	@GetMapping("/fetchById/{id}")
	public TeacherEntity featchById(@PathVariable("id") int id) {
		return teacherService.fetchById(id);
	}

	// FETCH
	// ALL--------------------------------------------------------------------------------------------
	@GetMapping("/fetchAll")
	public List<TeacherEntity> fetchAll() {
		return teacherService.fetchAll();
	}
}
