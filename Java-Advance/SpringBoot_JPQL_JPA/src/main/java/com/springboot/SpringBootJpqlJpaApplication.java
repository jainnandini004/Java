package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;
/*-------------------------------JPQL(Java/Jakarta Persistence Query Language)--------------------------------------------------------------------
				It is a platform independent object oriented query language. It allows us to access
	 				and persist data between Java object/ class and relational database. */



@SpringBootApplication
public class SpringBootJpqlJpaApplication {

	public static void main(String[] args) {
		  ApplicationContext context = SpringApplication.run(SpringBootJpqlJpaApplication.class, args);
		  EmployeeRepository repo=context.getBean(EmployeeRepository.class);
		 
	
			Employee emp = new Employee();

/*---------------------------------------------------Insert Records-----------------------------------------------------------------------------*/
			emp.setId(104);
			emp.setName("Krishna Pandit");
			emp.setSalary(2000);
			emp.setDept("CSE");
			Employee e=repo.save(emp);
			System.out.println(e);
			

			
			
/* ---------------------------------------------Find Record by name---------------------------------------------------------------------------- */
//		  List<Employee> emp = repo.findByName("Raj Jain");  
//		    for(Employee e:emp)
//		    {
//		    	System.out.println(e);
//		    } 
		    

			
			
/*---------------------------------------------Find all employee record------------------------------------------------------------------------*/
//		List<Employee> emp = repo.findAllEmployee();
//			 for(Employee e: emp)
//			 {
//				 System.out.println(e);
//			 }
	
			
			
		  
 /*----------------------------------------Extract partial information------------------------------------------------------------------------*/
//		List<Object[]> objs = repo.findStudentPartialInfo();
//			   for(Object[] ob:objs)
//			   {
//				   System.out.println(ob[0] + " " + ob[1]);
//			   }
//			   
//			   
			   
			 
			    
/*--------------------------------- Delete Row--------------------------------------------------------------------------------------------------*/
//			    int x = repo.deleteEmployeeById(101);
//				System.out.println(x + "row(s) delted"); 
			   
		  
			
			
/*-----------------------------------Find all employee record------------------------------------------------------------------------------------*/			   
//		    List<Employee> emp= repo.getAllEmployee(); 
//			  for(Employee e: emp)
//			  {
//				  System.out.println(e);
//			  }
				
	}
			    
	}


