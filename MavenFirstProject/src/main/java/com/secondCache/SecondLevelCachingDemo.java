package com.secondCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCachingDemo {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
//		Transaction tc=session.beginTransaction();
		//saving few objects..
//		Department d=new Department();
//		d.setName("CSE");
//		d.setNumberOfEmployees(400);
//		
//		Department d1=new Department();
//		d1.setName("ECE");
//		d1.setNumberOfEmployees(70);
//		Department d2=new Department();
//		d2.setNumberOfEmployees(500);
//		d2.setName("MEE");
//		
//		//saving objects into database
//		session.save(d);
//		session.save(d1);
//		session.save(d2);
		
//		tc.commit();
		
		//this is second level cache
		// even though we have closed our session1 but still we are able to access that object without firing to database
		//because in second level caching object is associated to sessionfactory object.
		
		
		Department dp=session.get(Department.class, 549);
		System.out.println(dp.getId()+" : "+dp.getName()+" : "+dp.getNumberOfEmployees());
		session.close();
		
		Session session2=factory.openSession();
		Department dp2=session2.get(Department.class, 549);
		System.out.println(dp2.getId()+" : "+dp2.getName()+" : "+dp2.getNumberOfEmployees());
		
		session2.close();
		//closing objects
		
		factory.close();
	
	
	

	}
}
