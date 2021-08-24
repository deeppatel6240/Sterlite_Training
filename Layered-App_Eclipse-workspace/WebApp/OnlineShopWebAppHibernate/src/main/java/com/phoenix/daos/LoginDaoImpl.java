/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 9th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.User;


public class LoginDaoImpl implements LoginDao{
	
	private static Session session;
	
	static {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		System.out.println("Oracle Database Connection is Established!");
		
	}

	@Override
	public List<User> getAllUsers() {
		
		Query query = session.createQuery("from User");
		return query.getResultList();
		
	}

	@Override
	public User getUserById(String username) {
	
		return session.get(User.class, username);
	}

	@Override
	public void insert(User user) {
		
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		
	}

	@Override
	public void update(User user) {
		
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
		
	}

	@Override
	public void delete(User user) {
		
		Transaction tx = session.beginTransaction();
		session.delete(user);
		tx.commit();
				
	}

}

	