package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.User;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 07/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

// DAO class Access object interface 
public interface LoginDao {

	// CRUD operations
	List<User> getAll();

	User getUserById(String username);

	void insert(User user);

	void update(User user);

	void delete(User user);
} // end of interface
