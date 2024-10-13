//Controller Class

package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_Class {
	/*
	 * ModelAndView is a holder for both Model and View in the web MVC framework.
	 * These two classes are distinct; ModelAndView merely holds both to make it
	 * possible for a controller to return both model and view in a single return
	 * value.
	 */
	@RequestMapping("/hello")
	public ModelAndView showView()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");//view name
		mv.addObject("res","WELCOME TO SPRING WEB XML BASED CONFIGURATION");//object
		
		return mv;//both object and view return in single object
	}
	
	
}
