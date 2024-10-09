package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;

@SpringBootApplication
public class SpringBootJpaPagenationLambokApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJpaPagenationLambokApplication.class, args);
		StudentRepository repo=context.getBean(StudentRepository.class);
		
/* -------------------------------------Pagenation and Sorting Repository interface ----------------------------------------------------------*/	

	
		
		
/*----------------------extract the number of rows with the help of PageRequest.of(start index,number of rows/size) method-----------------------*/
//		Page<Student> findAll = repo.findAll(PageRequest.of(0,2));
//		findAll.forEach(p->System.out.println(p)); //Lambda Expression used
		
		
		
		
/*-----------------------------------------Sort by first and last name---------------------------------------------------------------------------*/
//		List<Student> findAll=repo.findAll(Sort.by("firstname","lastname"));
//		findAll.forEach(p->System.out.println(p.getFirstname() + " " + p.getLastname()));
	
		
		
		
/*-------------------------------------sort in descending order by name then take out firstname in result------------------------------------*/
//		 List<Student> findAll = repo.findAll(Sort.by(Sort.Direction.DESC, "firstname"));
//		 findAll.forEach(p->System.out.println(p.getFirstname()));
	
		
		
		
/*------------------------------sort in descending order by name then take out number of record as per PageRequest method in result-------------*/		
//		 repo.findAll(PageRequest.of(0, 2, Direction.DESC, "firstname")).forEach(p->System.out.println(p.getFirstname())); 
//-------------------------------------------------OR-----------------------------------------------------------------------------------------------------------------
		 Page<Student> findAll=repo.findAll(PageRequest.of(0, 2, Direction.DESC, "firstname"));
		 findAll.forEach(p->System.out.println(p.getFirstname()));
	
	
	
	
	
	}

}
