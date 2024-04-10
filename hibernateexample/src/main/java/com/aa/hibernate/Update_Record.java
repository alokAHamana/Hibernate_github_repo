package com.aa.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aa.model.User_Detail;

public class Update_Record {
	
	public static void main(String[] args) {
		
		Configuration  cfg = new Configuration();
		cfg.configure("com/aa/hibernate/hibernate.cfg.xml");
		
		SessionFactory factory =cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		User_Detail user = new User_Detail();
	  
		user.setUserId(2);
	    user.setUserName("Anav ahamana");
	    
	    Transaction  tx   = session.beginTransaction();
	    
	    session.update(user);
	    
	    tx.commit();
	    
	    System.out.println("object updated successfully....");
	    
	    session.close();
	    factory.close();
	    
	    

	}

}
