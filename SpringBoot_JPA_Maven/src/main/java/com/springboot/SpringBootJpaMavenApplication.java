package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.bean.Student;
import com.springboot.repository.StudentRepository;

@SpringBootApplication
public class SpringBootJpaMavenApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJpaMavenApplication.class, args);
		StudentRepository repo = context.getBean(StudentRepository.class);

		Student stu = new Student();

//		Insert Records------------------------------------------------------------------------------------------------------------
//		stu.setId(100);
//		stu.setFirstname("Nandini");
//		stu.setLastname("Jain");	
//		Student st=repo.save(stu);
//		System.out.println(st);

		
		
//		FindAll the Records	-----------------------------------------------------------------------------------------------------------------------	
//		Iterable<Student> findAll = repo.findAll();
//		System.out.println(findAll);

		
		
//		Find by Id---------------------------------------------------------------------------------------------------------------------------------
//		Student st = repo.findById(100).get();
//		System.out.println(st);

		

//		Delete Record----------------------------------------------------------------------------------------------------------------------------
//		Student st = repo.findById(100).get();
//		repo.delete(st);

		
		
//		Update Record--------------------------------------------------------------------------------------------------------------------------
//		Student st = repo.findById(101).get();
//		st.setFirstname("Rashmi");
//		Student s = repo.save(st);
//		System.out.println(s);
		

//      Count Aggregation Function----------------------------------------------------------------------------------------------------------
		long st=repo.count();
		System.out.println(st);
		
		
//		Find by First Name---------------------------------------------------------------------------------------------------------
//		Student st = repo.findByFirstname("Rashmi");
//		System.out.println(st);
//			 
		
		

	}

}
