package com.hibernate;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.entity.Student;

public class Test 
{
    public static void main( String[] args )
    {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
    	Session session=factory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	Student stu=new Student();
    	
//    	INSERT OPERATION
//    	stu.setId(70);
//    	stu.setFirstname("Manvi");
//    	stu.setLastname("Sharma");
//    	session.save(stu);
    	
    	
//    	DELETE OPERATION
//    	stu.setId(74);
//    	session.delete(stu);
    	
    	
//    	UPDATE OPERATION
    	stu.setId(72);
        stu.setFirstname("chandra");
        stu.setLastname("verma");
        session.update(stu);
    	
    	transaction.commit();
    	
    	System.out.println( "Successfully Saved" );
    	
    	factory.close();
    	session.close();
    	
        
    }
}
