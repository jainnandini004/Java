package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.entity.Student;
public class Test {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Student stu = new Student();
		stu.setId(102);
		stu.setFirstname("kajol");
		stu.setLastname("verma");
		session.save(stu);

		transaction.commit();

		System.out.println("Operation Successful");
		factory.close();
		session.close();

	}
}
