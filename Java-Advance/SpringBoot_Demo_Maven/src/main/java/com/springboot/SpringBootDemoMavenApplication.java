//INITIATOR OF SPRING BOOT PROJECT

package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.beans.Student;

@SpringBootApplication
public class SpringBootDemoMavenApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootDemoMavenApplication.class, args);
		
		Student student = context.getBean(Student.class);
		
		//setting the values to Student object by calling setter methods- setter injection 
		
		student.setStid(74);
		student.setStname("Nandini");
		
		//we are displaying student object- toString()
		System.out.println(student);
	}

}
