package com.emp.hibernate.main;
/*
 * @Description
 * 		// It is used to perform DataBase operations using 
 * 			Hibernate framework //
 * 
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.emp.entities.EmpPojo;

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
		EmpPojo ep = ss.get(EmpPojo.class, 601);
		System.out.println(ep);
		
		/*
		 * EmpPojo epInsert = new EmpPojo(601, "sakti", "patel", "sp@gmail.com", 8320757497, 1002, "server side programming"); 
		 * ss.save(epInsert);
		 */
//----->// end database operations
		
		// commit transaction
		tx.commit();
		
		// close session (database connection)
		ss.close();
	}

} // end of the class
