package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/home")
	public ModelAndView showPage(Model model)
	{
	ModelAndView mv=new ModelAndView();
	mv.setViewName("hello1");
    return mv;
	
	
//		@RequestMapping("/")
//		public String index()
//		{
//			return "hello";
//		}
	}
}
