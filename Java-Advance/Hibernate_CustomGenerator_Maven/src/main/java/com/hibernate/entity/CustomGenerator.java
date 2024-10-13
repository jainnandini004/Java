package com.hibernate.entity;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator{
public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		int id=0;
		Random random = new Random();
		
		
		id=random.nextInt(1000);
		
		
		return "stu-" + id;
}

}
