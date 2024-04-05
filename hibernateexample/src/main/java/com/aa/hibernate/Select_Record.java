package com.aa.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aa.model.User_Detail;

public class Select_Record {

	public static void main(String[] args) {

	
	Configuration config =new Configuration();
	
	config.configure("/com/aa/hibernate.cfg.xml");
	
	SessionFactory factory = config.buildSessionFactory();
	
	Session	session =factory.openSession();
	
	  
    Object obj = session.load(User_Detail.class, new Integer(1));
    
    User_Detail users= (User_Detail)obj;
    
    System.out.println(users.getUserId()+" "+ users.getUserName());
    
    System.out.println("Object loaded successfully....!!!");

	
	
	}

}
