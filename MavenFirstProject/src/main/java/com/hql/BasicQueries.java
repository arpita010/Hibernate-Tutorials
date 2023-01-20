package com.hql;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class BasicQueries {
	public static void main(String[] args )
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
//		Transaction tc=session.beginTransaction();
		
//		Course course=new Course();
//		course.setName("course 3");
//		course.setDuration("7 months");
		
//		session.save(course);
		
		
//		tc.commit();
		
		//Various queries
		//1.delete 
		//String deleteQuery="delete from Course where ";
		
		//2. update query
		// "update Course set cid=:x";
		
		Query q=session.createQuery("from Course where cid=:x");
		
		
		
		//similarly we can use and , or ,not operator in where clause;
//		int r=q.executeUpdate(); 
		// it will return number of records which got affected.
		q.setParameter("x", 619);
		List<Course> list=q.list();
		for(Course c:list)
		{
			System.out.println(c.getCid()+" "+c.getDuration()+" "+c.getName());
		}
			
		//inner join query 
		// select q.question,q.questionId,a.answer from question as q inner join answer as a;
		
		session.close();
		factory.close();
	}
}
