package com.pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tc=session.beginTransaction();
		
		//objects
		ChildClass child=new ChildClass();
		child.setChildName("beti");
		child.setChildPhone("94582675");
		
		ParentClass pr=new ParentClass();
		pr.setParentName("Papa");
		pr.setParentPhone("03975238");
		pr.setChild1(child);
		
		//save object
		session.save(pr);
		
		tc.commit();
		
		
		session.close();
		factory.close();
	}
}
