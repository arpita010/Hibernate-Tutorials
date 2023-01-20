package com.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class ManyToManyDemo {
	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		Project p1=new Project();
		Project p2=new Project();
		Employee e1=new Employee();
		Employee e2=new Employee();
		List<Employee> empList=new ArrayList<Employee>();
		List<Project> projList=new ArrayList<Project>();
		p1.setPid(1);
		p2.setPid(2);
		e1.setEid(5);
		e2.setEid(6);
		p1.setProjectName("p1");
		p2.setProjectName("p2");
		e1.setEmpName("e1");
		e2.setEmpName("e2");
		
		empList.add(e1);
		empList.add(e2);
		projList.add(p1);
		projList.add(p2);
		
		
		
		p1.setEmps(empList);
		p2.setEmps(empList);
		
		e1.setProjects(projList);
		e2.setProjects(projList);
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		
		tc.commit();
		
		factory.close();
		session.close();
	}
}
