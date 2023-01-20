package com.ObjectStates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ObjectStatesDemo {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		
		//create person's object.
		//Transient state
		Person person=new Person("Arpita","a@gmail.com");
		System.out.println("Transient State Person : "+person);
		
		//now it is in transient state.because we have just created object of person.
		//It is not associated with database and session object.
		
		//Persistent State
		session.save(person);
		person.setName("Arpita Mittal");
		
		//We have changed name after saving but it still get updated in database because till now it is in persistent state 
		//which means it is in session object as well as database;
		System.out.println("Persistent state person : "+person);
		

		tc.commit();
		
		//3. detached state
		session.close();
		person.setName("Arpitaaaa");
		//it will not get updated in database. because we have closed our session object.
		
		
		
		
		session.close();
	}
}
