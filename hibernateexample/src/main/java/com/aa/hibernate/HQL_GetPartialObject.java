package com.aa.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.aa.model.User_Detail;

public class HQL_GetPartialObject {

	public static void main(String[] args) {

			Configuration cfg = new Configuration();

			cfg.configure("com/aa/hibernate/hibernate.cfg.xml");

			SessionFactory factory = cfg.buildSessionFactory();

			Session session = factory.openSession();
			
			Query qry = session.createQuery("select u.userId ,u.userName from User_Detail u");

			List list = qry.list();

			System.out.println("Total Number of records " + list.size());

			Iterator  itr = list.iterator();

			while (itr.hasNext()) {
				Object[] obj = (Object[] )itr.next();

			System.out.println("userId:" +obj[0]+  ",   userName: "+obj[1]);

	}
	}
}
