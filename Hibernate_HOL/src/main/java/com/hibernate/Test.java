package com.hibernate;

import java.util.List;

import javax.persistence.EntityTransaction;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.hibernate.entity.Student;

public class Test 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
//		Query query=session.createQuery("from Student");
//		query.setFirstResult(0);
//		query.setMaxResults(3);
//		List list=query.list();
//		System.out.println(list);
//		transaction.commit();
//        System.out.println( "Successfully Saved" );
        
		
		
		Query query=session.createQuery("update Student set firstname=:fn where id=:id");
		query.setParameter("fn", "Rashmi");
		query.setParameter("id", 1);
		int status=query.executeUpdate();
		
		
		
//		
//		Student stu=new Student();
		
//		stu.setFirstname("Ankita");
//		stu.setLastname("Jain");
//		session.save(stu);
		
		transaction.commit();
		System.out.println("Rows affected: " + status);
       
        
        
        factory.close();
        session.close();
    
    }
    
    
}
