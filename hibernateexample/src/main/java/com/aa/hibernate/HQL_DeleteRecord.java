package com.aa.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQL_DeleteRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/aa/hibernate/hibernate.cfg.xml");
	
		SessionFactory factory =cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		
	     Query query = session.createQuery("delete from Product u where u.productId=:abc");
	        Transaction tx = session.beginTransaction();
	        query.setParameter("abc", 1);
	        
	        int result = query.executeUpdate();
	        
	         System.out.println("Command successfully executed....");
	            System.out.println("Numer of records effected due to delete query"+result);
	        tx.commit();
	        session.close();
	        session.close();
	        
	    }
	
}
