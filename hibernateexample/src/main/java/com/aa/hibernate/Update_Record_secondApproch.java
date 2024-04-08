package com.aa.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aa.model.User_Detail;

public class Update_Record_secondApproch {

	public static void main(String[] args) {

		
		  Configuration cfg = new Configuration();
	        
	        cfg.configure("com/rsg/hibernate.cfg.xml");
	        
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        
	        Session session = sessionFactory.openSession();
	        
	        User_Detail user = new User_Detail();
			user.setUserId(15);
			user.setUserName("Shyam  -kk");
	        
	        
	        org.hibernate.Transaction tx =session.beginTransaction();
	        
	        session.update(user);
	        
	        System.out.println("Session Updated successfully");
	        
	        tx.commit();
	        session.close();
	        sessionFactory.close();
	}

}
