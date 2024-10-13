package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    	Student stu = (Student)context.getBean("stu");
    	stu.setId(74);
    	stu.setName("Nandini Jain");

    	System.out.println("student id: " + stu.getId());
    	System.out.println("student name: " + stu.getName());
	}

}
