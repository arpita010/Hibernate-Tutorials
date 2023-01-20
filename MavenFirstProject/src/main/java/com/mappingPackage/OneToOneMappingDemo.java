package com.mappingPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMappingDemo {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		
		Question q1=new Question();
		Answer a1=new Answer();
		a1.setAnswer("java is HLPL.");
		a1.setQues(q1);
		q1.setQuestion("what is java");
		q1.setAns(a1);
		
		session.save(a1);
		session.save(q1);
		
		
		
		
		//transaction commit
		tc.commit();
		
		
		//objects closed;
		session.close();
		factory.close();
	}
}
