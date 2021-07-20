package com.phoenix.daos;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.User;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 07/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

// DAO class Access object interface 
public interface LoginDao {

	// CRUD operations
	List<User> getAll() throws SQLException;

	User getUserById(String username) throws SQLException;

	void insert(User user) throws SQLException;

	void update(User user) throws SQLException;

	void delete(User user) throws SQLException;
} // end of interface
