package com.maven2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		
		ModelAndView mv = new ModelAndView();
		
		//setting the view name
		 mv.setViewName("Hello");
		    
		return mv;
		
	}

}