package com.aa.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aa.model.User_Detail;

public class Delete_Record {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("com/aa/hibernate/hibernate.cfg.xml");
		
		SessionFactory factory =cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Object obj = session.load(User_Detail.class, new Integer(5));
		
		 User_Detail user= (User_Detail)obj;
		 
		 Transaction tx = session.beginTransaction();
		 session.delete(user);
		 
		 System.out.println("Object delete  ... successfully....!!!");
		    
		    
		    tx.commit();
		    session.close();
		    factory.close();
		    
	}

}
