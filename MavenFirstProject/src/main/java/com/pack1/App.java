package com.pack1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //configure method with configure our hibernate.cfg.xml file;
        //if this file is not located at right place , you can provide
        //its path in configure() method
        //make sure to pass whole path of your configuration file;
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Student stu=new Student();
        stu.setRollNumber(1);
        stu.setName("Arpita");
        stu.setEmail("arpita");
        stu.setCourse("btech");
        Session session=factory.openSession();
        
        Transaction t=session.beginTransaction();
       session.save(stu);
       t.commit();
       session.close();
        //        System.out.println(factory);
//        System.out.println(factory.isClosed());
        
    }
}
