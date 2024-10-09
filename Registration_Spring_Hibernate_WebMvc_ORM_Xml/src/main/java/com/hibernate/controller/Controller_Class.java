package com.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.hibernate.entity.Student;
import com.hibernate.service.ServiceInterface;

@Controller
public class Controller_Class {
	
	@Autowired
	 private ServiceInterface service;//Reference Variable
	 
	 public ServiceInterface getService() {
		return service;
	}

	public void setService(ServiceInterface service) {
		this.service = service;
	}
	
	@RequestMapping("registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value="registerUser")
	public ModelAndView registerUser(@RequestParam("id")int id,@RequestParam("firstname") String firstname, @RequestParam("lastname")String lastname)
	{
		Student stu=new Student();
		stu.setId(id);
		stu.setFirstname(firstname);
		stu.setLastname(lastname);
		
		int result=service.save(stu);
		
//-----------------------------------------------------------------------------------------------------------------------------------------------	
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("result","Successfully user having "+result+" id added in the Database");
		mv.setViewName("userReg");
        return mv;
	
	
	}

}
