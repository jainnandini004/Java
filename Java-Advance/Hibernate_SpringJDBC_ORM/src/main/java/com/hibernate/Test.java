package com.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.Dao.StudentDao;
import com.hibernate.entity.Student;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");
    	
        StudentDao dao=(StudentDao)context.getBean("dao");
        
        Student stu=new Student();
        
        
//        INSERTION OPERATION
        stu.setId(1);
        stu.setFirstName("Raj");
        stu.setLastName("Jain");
//       int x=dao.saveStudent(stu);
//    	System.out.println( x+"row(s) inserted" );
        
//        DELETION OPERATION
//        	dao.delete(stu);
        	
//          UPDATE OPERATION
          	dao.update(stu);
    }
}
