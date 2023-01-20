package com.hql;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
public class NativeSQLQuery {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		String query="select * from person";
		NativeQuery nq=session.createSQLQuery(query);
		
		List<Object[]> list=nq.list();
		
		for(Object[] arr:list)
		{
			System.out.println(arr[0]+" : "+arr[1]+" : "+arr[2]);
		}
		
	}
}
