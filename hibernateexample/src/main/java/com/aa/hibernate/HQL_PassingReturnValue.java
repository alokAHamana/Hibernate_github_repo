package com.aa.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.aa.model.User_Detail;

public class HQL_PassingReturnValue {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration();
		cfg.configure("com/aa/hibernate/hibernate.cfg.xml");
	
		SessionFactory factory =cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
	// By using Lable
    Query<User_Detail> query = session.createQuery("from User_Detail u where u.userName=?3");
        
        query.setParameter(3,"Ravi");
        
        List<User_Detail> list = query.list();
        
        System.out.println("Total number of records: "+list.size());
        
        Iterator<User_Detail> itr = list.iterator();
        
        while(itr.hasNext()) {
            Object obj = itr.next();
            
            User_Detail user = (User_Detail)obj;
            
            System.out.println("UserId: "+user.getUserId());
            System.out.println("UserName: "+user.getUserName());
        }
    }
}
