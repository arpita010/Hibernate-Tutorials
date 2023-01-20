package com.hql;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ObjectStates.Person;
public class FirstLevelCaching {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Course course=session.get(Course.class, 619);
		System.out.println(course.getCid()+" : "+course.getName()+":"+course.getDuration());
		//after first call, session object put this course object in session object's cache
		//that's why when we again try to get this object then it will
		//not fire query against database 
		// it will get this object from cache itself.
		/// this is called First level caching;
		// This is associated to session object.
		// it is by default enabled
		Course course1=session.get(Course.class, 619);
		System.out.println(course1.getCid()+" : "+course1.getName()+":"+course1.getDuration());
		System.out.println("Session object's cache contains : "+session.contains(course1));
		
		
		session.close();
		factory.close();
	}
}
