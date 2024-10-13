package com.maven;


import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maven2.EmployeeDao;

public class Test 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
         EmployeeDao dao = (EmployeeDao)context.getBean("dao");
         
//         Employee emp = new Employee();

			
//			 emp.setEmpId(108); 
//			 emp.setEmpfirstName("deepak");
//			 emp.setEmplastName("gupta");
//			 int x = dao.saveEmployee(emp); 
//			 System.out.println(x + "row(s) inserted");
//			 
         			
			
//			  emp.setEmpId(104);
//			  int x = dao.saveEmployee(emp); 
//			  System.out.println(x + "row(s) deleted");
//			 
         
			/*
			 * emp.setEmpId(104); 
			 * emp.setEmpfirstName("shruti");
			 * int x = dao.saveEmployee(emp); 
			 * System.out.println(x + "row(s) updated");
			 */
         
//        
//         Employee emp = dao.read(101);
//         System.out.println("employee id is: " + emp.getEmpId());
//         System.out.println("employee first name is: " + emp.getEmpfirstName());
//         System.out.println("employee last name is: " + emp.getEmplastName());
//      

         List<Employee> emps = dao.findAll();
         
         for(Employee e: emps)
         {
       	  System.out.println(e.getEmpId() + " " + e.getEmpfirstName() + " " + e.getEmplastName());
         }
       	
       }	  

    }
