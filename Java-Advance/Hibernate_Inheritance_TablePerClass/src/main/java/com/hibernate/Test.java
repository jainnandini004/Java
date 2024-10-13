package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.entity.Contract_Employee;
import com.hibernate.entity.Employee;
import com.hibernate.entity.Regular_Employee;
//in this strategy, tables are created as per class but related by foregin key
public class Test 
{
    public static void main( String[] args )
    {
    	

    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Employee emp= new Employee();
		emp.setName("Nandini");
		
		
		Regular_Employee re=new Regular_Employee();
		re.setName("Ankita");
		re.setSalary(80000f);
		re.setBonus(800);
		
		
		Contract_Employee ce=new Contract_Employee();
		ce.setName("Raj");
		ce.setContract_duration("7 hours");
    	ce.setPay_per_hour(50f);
    	
    	session.save(emp);
    	session.save(re);
    	session.save(ce);
    	
    	transaction.commit();
    	
        System.out.println( "Successfully Saved" );
        factory.close();
        session.close();
        
    }
}
