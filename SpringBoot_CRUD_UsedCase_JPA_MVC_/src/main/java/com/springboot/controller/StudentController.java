package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
    StudentService studentService;
		
	
/*-----------------------------------------existing-student--------------------------------------*/
	
    @RequestMapping("/read-student")
	public String ShowExistingStudentPage(Model model)
	{
		model.addAttribute("students", studentService.findAll());
		return  "readStudent";
	}
    
/* ------------------------------------------new-student----------------------------------------- */
    
    @RequestMapping("/create-student")
	public String ShowCreateStudentPage(Model model)
	{
		model.addAttribute("command", new Student());
		return  "createStudent";
	}
    
/*-------------------------------- save new student --------------------------------------------*/
    
    @RequestMapping(value = "/create-student", method = RequestMethod.POST)
    public String createStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/read-student";    
    } 
    
/*------------------------------delete student----------------------------------------------*/
    
    @RequestMapping(value = "/delete-student/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteById(id);
        return "redirect:/read-student";
    }
    
/*------------------------------update student----------------------------------------------*/
    
    @RequestMapping(value = "/update-student/{id}")
    public String showUpdateStudentPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", studentService.findById(id).orElse(null));
        return "updateStudent";
    }  
    
/*------------------------------save update student----------------------------------------------*/
   
    @RequestMapping(value = "/update-student/{id}", method = RequestMethod.POST)
    public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student) {
        studentService.updateStudent(id, student);
        return "redirect:/read-student";
    }   
    

}
