package com.aa.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aa.model.User_Detail;

public class Insert_Record {

	public static void main(String[] args) {

		System.out.println("Project  Start");

		User_Detail user = new User_Detail();
		user.setUserId(5);
		user.setUserName("Anav");

		Configuration config = new Configuration();

		config.configure("/com/aa/hibernate/hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
		 session.close();
		 factory.close();
		
		
		System.out.println(factory);
	}

}
