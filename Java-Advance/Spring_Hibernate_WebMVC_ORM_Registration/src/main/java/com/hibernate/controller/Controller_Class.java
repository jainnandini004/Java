//Controller Class

package com.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hibernate.dao.StudentDao;
import com.hibernate.entity.Student;


@Controller
public class Controller_Class {

	@RequestMapping("hello")
	public ModelAndView showView()
	{
		StudentDao dao=new StudentDao();
		Student obj=new Student();
		int result=dao.register(obj);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result");
		
		if (result>0)
		{
		mv.addObject("res","Successfully Registered");
		}
		
		return mv;
	}
	
	
}
