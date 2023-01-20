package com.pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		//get method demo
		Address add=(Address)session.get(Address.class, 1);
		//load method demo
		Address add2=(Address)session.load(Address.class, 1);
		
		System.out.println("load address street : "+add2.getStreet());
		System.out.println("load address city : "+add2.getCity());
		
		
		System.out.println("Street : "+add.getStreet());
		System.out.println("City : "+add.getCity());
		
		session.close();
		factory.close();
	}
}
