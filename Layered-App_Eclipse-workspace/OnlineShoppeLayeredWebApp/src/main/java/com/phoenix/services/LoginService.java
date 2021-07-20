package com.phoenix.services;

import java.util.List;

import com.phoenix.data.User;
import com.phoenix.exceptions.ServiceException;
import com.phoenix.exceptions.UserAlreadyExistException;
import com.phoenix.exceptions.UserNotFoundException;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 08/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
public interface LoginService {

	// methods and list operations
	List<User> findAll() throws ServiceException;

	User findByUserId(String username) throws UserNotFoundException, ServiceException;

	void add(User user) throws UserAlreadyExistException;

	void edit(User user) throws ServiceException;

	void remove(User user) throws ServiceException;

	String changePassword(String newPassword) throws ServiceException;
}
