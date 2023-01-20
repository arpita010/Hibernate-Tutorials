package com.pack1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OrderApp
{
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tc=session.beginTransaction();
		
		//create order obj
		Order ord=new Order();
		
		ord.setAddress("addresssssss");
		ord.setDate(new Date());
		ord.setName("arpita");
		ord.setTotal(1000);
		
		//save order
		session.save(ord);
		
		//commit
		tc.commit();
		
		
		session.close();
	}
}