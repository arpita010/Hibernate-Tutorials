package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class XmlMappingDemo {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		Teacher teacher=new Teacher();
		teacher.setName("Madam 1");
		teacher.setPhone("3582678728");
		
		session.save(teacher);
		
		tc.commit();
		
		
		
		
		session.close();
		factory.close();
	}
}
