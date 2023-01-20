package com.pack1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddressApp {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		
		Address add=new Address();
		add.setDate(new Date());
		add.setCity("Meerut");
		add.setOpen(true);
		add.setStreet("street 1");
		add.setX(123.45);
		
		session.save(add);
		
		tc.commit();
		session.close();
	}
}
