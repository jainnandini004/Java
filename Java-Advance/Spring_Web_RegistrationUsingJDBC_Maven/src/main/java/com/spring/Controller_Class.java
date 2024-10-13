	
// Step2 :create controller class under src/main/java under one package(com.sopra.controller)
//  make sure controller class must be annotated with @Controller annotation.


package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring1.RecordDao;

@Controller
public class Controller_Class {
	
	@Autowired
	private RecordDao dao;
	
	
	@RequestMapping("/showreg")
	public ModelAndView showRegistrationPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("userReg");
		return mv;
	}
	
	
	@RequestMapping(value="/registerUser",method = RequestMethod.POST)
	
	
//	First Approach
//	public ModelAndView registerStudent(HttpServletRequest req,HttpServletResponse res)
//	{
//		String stid = req.getParameter("stid");
//		String firstName = req.getParameter("firstName");
//		String lastName = req.getParameter("lastName");
//		Student stu=new Student();
//		stu.setStid(stid);
//		stu.setFirstName(firstName);
//		stu.setLastName(lastName);
//		dao.register(stu);
//		
//	
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("stu",stu);
//		mv.setViewName("success");
//		return mv;
	
	
	
//	Second Approach	BEST
//		public ModelAndView registerStudent(@RequestParam("stid") int stid, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
//		{
//				
//		Student stu=new Student();
//		stu.setStid(stid);
//		stu.setFirstName(firstName);
//		stu.setLastName(lastName);
//		dao.register(stu);
//	
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("stu",stu);
//		mv.setViewName("success");
//		return mv;

	
	
	
//	Third Approach
	/*
	 * 
	 * 1.it will take the form parameter values and bind it to Student model class properties
	 *   by creating the Student class object
	 * 2. we no need to add the object to model also
	 * 
	 * 
	 */
	public ModelAndView registerStudent(@ModelAttribute("stu") Student stu)
	{   

			
		dao.register(stu);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("stu",stu);
		mv.setViewName("success");
		return mv;
	}
	

}

