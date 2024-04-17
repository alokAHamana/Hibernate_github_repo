package com.aa.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aa.model.Product;
import com.aa.model.User_Detail;

public class Insert_Product {
	
	
	public static void main(String[] args) {

		System.out.println("Project  Start");

		Product product = new Product();
		product.setProductId(55);
		product.setProName("Raaam");
		product.setPrice(4010);

		Configuration config = new Configuration();

		config.configure("/com/aa/hibernate/hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(product);
		
		session.getTransaction().commit();
		 session.close();
		 factory.close();
		
		
		System.out.println(factory);
	}

}
