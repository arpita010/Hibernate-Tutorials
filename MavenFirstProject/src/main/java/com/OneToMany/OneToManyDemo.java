package com.OneToMany;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class OneToManyDemo {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		
		Parent p=new Parent();
		List<Child> clist=new ArrayList<Child>();
		Child c1=new Child();
		Child c2=new Child();

		c1.setChildId(3);
		c1.setChildName("c55");
		c1.setParent(p);
		c2.setChildId(6);
		c2.setChildName("c66");
		c2.setParent(p);
		clist.add(c1);
		clist.add(c2);
		p.setParentId(5);
		p.setFather("f2");
		p.setMother("m2");
		p.setList(clist);
		
		
		session.save(c1);
		session.save(c2);
		session.save(p);
		
		tc.commit();
		
		session.close();
		factory.close();
	}
}
