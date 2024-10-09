package com.spring.controller;

import java.util.ArrayList;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HelloController {
//	
//	@RequestMapping("/hello")
//	public ModelAndView hello()
//	{
//		
//		ModelAndView mv = new ModelAndView();
//		
//		mv.addObject("stid",100);
//		mv.addObject("stname","ram");
//		mv.addObject("staddress","hyd");
//		
//		
//		
//		//setting the view name
//		 mv.setViewName("Hello");
//		    
//		return mv;
//		
//	}
//
//}


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		List<Student> students = new ArrayList<Student>();
		
		
		ModelAndView mv = new ModelAndView();
		
		Student stu1 = new Student();
		stu1.setStid(100);
		stu1.setStname("Ram");
		
		
		Student stu2 = new Student();
		stu2.setStid(200);
		stu2.setStname("sopra");
		
		
		students.add(stu1);
		students.add(stu2);
		
		
		mv.addObject("students",students);
		
		
		//setting the view name
		 mv.setViewName("Hello");
		    
		return mv;
		
	}

}