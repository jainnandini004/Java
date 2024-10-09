// Step2 :create controller class under src/main/java under one package(com.sopra.controller)
//  make sure controller class must be annotated with @Controller annotation.


package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_class {
	
	
	@RequestMapping("/showreg")
	public ModelAndView showRegistrationPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("userReg");
		return mv;
	}
	
	@RequestMapping(value="/registerUser",method = RequestMethod.POST)
	public ModelAndView registerStudent(HttpServletRequest req,HttpServletResponse res)
	{
		String stid = req.getParameter("stid");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		
		Student stu=new Student();
		stu.setStid(Integer.parseInt(stid));
		stu.setFirstName(firstName);
		stu.setLastName(lastName);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("stu",stu);
		mv.setViewName("success");
		return mv;
	}
	

}
