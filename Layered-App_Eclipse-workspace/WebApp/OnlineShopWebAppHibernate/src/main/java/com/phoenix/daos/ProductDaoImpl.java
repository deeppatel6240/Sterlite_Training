/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 9th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.Product;

public class ProductDaoImpl implements ProductDao {
	
	private static Session session;
		
	static {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		System.out.println("Oracle Database Connection is Established!");
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return session.createQuery("from Product").getResultList();
		
	}

	@Override
	public Product getProductById(int id) {
			
		return session.get(Product.class, id);
		
	}

	@Override
	public void insert(Product product) {
		
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
		System.out.println("Product is inserted");
		
	}

	@Override
	public void update(Product product) {
		
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();
		
	}

	@Override
	public void delete(Product product) {
		
		Transaction tx = session.beginTransaction();
		session.delete(product);
		tx.commit();
		
	}
	
}
