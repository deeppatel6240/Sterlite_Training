package com.phoenix.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.User;

public class LoginDaoImpl implements LoginDao {

	private static Session session;

	// static block
	static {
		Configuration cfg = new Configuration().configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		
		System.out.println("Oracle Database connection established");
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("FROM User");
		return query.getResultList();
	}

	@Override
	public User getUserById(String username) {
		// TODO Auto-generated method stub
		return session.get(User.class, username);
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		// save session
		session.save(user);
		// commit transaction
		tx.commit();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		// save session
		session.update(user);
		// commit transaction
		tx.commit();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		// save session
		session.delete(user);
		// commit transaction
		tx.commit();
	}

} // end of the class
