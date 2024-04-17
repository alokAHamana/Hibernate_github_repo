package com.aa.hibernate;

import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aa.model.User_Detail;

public class HQL_Select_Record {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("com/aa/hibernate/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Query<User_Detail> qry = session.createQuery("from User_Detail user");

		List<User_Detail> userList = qry.list();

		System.out.println("Total Number of records " + userList.size());

		Iterator<User_Detail> itr = userList.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();
			User_Detail user = (User_Detail) obj;

			System.out.println("userId : " + user.getUserId() + " userName : " + user.getUserName());

		}
	}
}