package com.phoenix.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.entities.Product;

/*
 * @Description
 * 		// It is used to perform DataBase operations using 
 * 			Hibernate framework //
 * 
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 07/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create Configuration object and read hibernate configuration
		Configuration cfg = new Configuration().configure();
		
		// build session factory (Singleton class & Heavy weight)
		SessionFactory factory = cfg.buildSessionFactory();

		// establish Database connection
		Session ss = factory.openSession();
		
		// Obtain Hibernate Transaction
		Transaction tx = ss.beginTransaction();
		
// ---->// Code for database operations
		
		// getting database row as object0
		//Product product = ss.get(Product.class, 1997);
		//System.out.println(product);
		
		// insert an object as new row in product
		
		// transient object
		//Product p = new Product(9014, "Trimmer", "Syska", (float) 1299.00);
		// persistent object
		//ss.save(p);
		
		/*
		 * Product pro = ss.load(Product.class, 1997); System.out.println("Product Id: "
		 * + pro.getProductId()); System.out.println("Product name:" +
		 * pro.getProductName()); System.out.println("Product brand: " +
		 * pro.getBrand()); System.out.println("Product price: " + pro.getPrice());
		 */
		
		// update row price using an object
		/*
		 * Product p = ss.get(Product.class, 1997); if (p != null) {
		 * p.setPrice(154000.00f); p.setBrand("MI"); ss.update(p); } else {
		 * System.out.println("Sorry! Product not found"); }
		 * 
		 * p = ss.get(Product.class, 1997);
		 * 
		 * if(p != null) { System.out.println(p); } else {
		 * System.out.println("Sorry! Product not found"); }
		 */
		
		// delete row using an object
		Product p = ss.get(Product.class, 1997);
		
		if (p != null) {
			ss.delete(p);
		} else {
			System.out.println("Sorry! Product is not found");
		}
	
//----->// end database operations
		
		// commit transaction
		tx.commit();
		
		// close session (database connection)
		ss.close();
	}

}
