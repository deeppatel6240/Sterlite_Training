package com.practice.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.entities.PracticeEmp;

/*
 * @Description
 * 		// It is used to perform DataBase operations using 
 * 			Hibernate framework //
 * 
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

public class HibernateMain {
	
	public static void main(String[] args) {
		
		// Create Configuration object and read hibernate configuration
		Configuration cfg = new Configuration().configure();

		// build session factory (Singleton class & Heavy weight)
		SessionFactory factory = cfg.buildSessionFactory();
		
		// establish Database connection
		Session ss = factory.openSession();
		
		// Obtain Hibernate Transaction
		Transaction tx = ss.beginTransaction();

//------> start database operation
			
		PracticeEmp pe = ss.get(PracticeEmp.class, 101);
		System.out.println(pe);
		
//------> end database operation
		
		// commit transaction
		tx.commit();
		
		// close session (database connection)
		ss.close();
		
	}
}
