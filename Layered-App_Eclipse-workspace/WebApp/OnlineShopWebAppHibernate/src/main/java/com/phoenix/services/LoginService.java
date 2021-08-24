/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.services;

import java.util.List;


import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserAlreadyExistException;
import com.phoenix.web.exceptions.UserNotFoundException;

public interface LoginService {
	
	List<User> findAll() throws ServiceException;
	User findUserById(String username) throws UserNotFoundException;
	void add(User user) throws UserAlreadyExistException;
	void edit(User user) throws ServiceException;
	void remove(User user) throws ServiceException;
	String changePassword(String newPassword) throws ServiceException;
	
}
