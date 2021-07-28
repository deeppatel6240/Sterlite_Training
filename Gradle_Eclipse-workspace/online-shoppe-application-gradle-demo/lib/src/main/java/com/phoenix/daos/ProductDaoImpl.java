package com.phoenix.daos;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.Product;

public class ProductDaoImpl implements ProductDao {

	private static Session session;

	// static block
	static {
		Configuration cfg = new Configuration().configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		
		System.out.println("Oracle Database connection established");
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return session.get(Product.class, id);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return session.createQuery("FROM Product").getResultList();
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.delete(product);
		tx.commit();
	}

} // end of the class
