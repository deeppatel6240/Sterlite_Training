package com.phoenix.services;

import java.util.List;

import com.phoenix.entities.User;
import com.phoenix.exceptions.UserAlreadyExistException;
import com.phoenix.exceptions.UserNotFoundException;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 2/08/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * Description:
 *   	Service class of application layer
 */
public interface UserService {
	
	// user define method
	User findByUsername(String username) throws UserNotFoundException;
	
	List<User> findAllUsers();
	
	void add(User user) throws UserAlreadyExistException;
	
	void edit(User user);
	
	void remove(User user);
	
}
