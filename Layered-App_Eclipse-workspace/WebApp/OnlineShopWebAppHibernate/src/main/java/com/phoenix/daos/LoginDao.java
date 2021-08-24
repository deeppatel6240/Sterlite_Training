/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 9th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.daos;


import java.util.List;

import com.phoenix.data.User;

public interface LoginDao {
	
	// CRUD Methods
	List<User> getAllUsers();
	User getUserById(String username);
	void insert(User user);
	void update(User user);
	void delete(User user);
	
}
