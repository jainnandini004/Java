package com.hibernate.controller;

import com.hibernate.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class Controller_Class {
	@RequestMapping("/afterregister")
	public ModelAndView showView(@RequestParam("id") int id, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName)
	{
		Student stu=new Student();
		stu.setId(id);
		stu.setFirstname(firstName);
		stu.setLastname(lastName);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("stu",stu);
		
		return mv;
	}

}
