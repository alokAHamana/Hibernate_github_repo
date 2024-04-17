package com.aa.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aa.model.Product;
import com.aa.model.User_Detail;

public class CriteriaProductClient {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/aa/hibernate/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		// **creating     CriteriaBuilder**
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = builder.createQuery(Product.class);

		Root<Product> productRoot = criteriaQuery.from(Product.class);
		criteriaQuery.select(productRoot);

		// **Adding where clause**
		criteriaQuery.where(builder.equal(productRoot.get("price"), Double.valueOf(5000)));
		List<Product> listProduct = session.createQuery(criteriaQuery).getResultList();

		System.out.println("List total size..._" + listProduct.size());
		Iterator<Product> itr = listProduct.iterator();

		while (itr.hasNext()) {
			Product product = (Product) itr.next();
			System.out.println(product.getProductId() + " " + product.getProName() + " " + product.getPrice());
			System.out.println("-----------------");
		}

		session.close();
		factory.close();
	}

}
