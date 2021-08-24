/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 9th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.services;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserAlreadyExistException;
import com.phoenix.web.exceptions.UserNotFoundException;

public class LoginServiceImpl implements LoginService {

	private LoginDao ld;
	
	public LoginServiceImpl() {
	
		ld = new LoginDaoImpl();
		
	}
	
	@Override
	public List<User> findAll() throws ServiceException {
		
		return ld.getAllUsers();
	}

	@Override
	public User findUserById(String username) throws UserNotFoundException {
		
		User user = ld.getUserById(username);
		if(user != null)
			return user;
		else
			throw new UserNotFoundException("Sorry! User does not exist!!");
	}

	@Override
	public void add(User user) throws UserAlreadyExistException{
		
		ld.insert(user);
	}

	@Override
	public void edit(User user) throws ServiceException {

		ld.update(user);
	}

	@Override
	public void remove(User user) throws ServiceException {
		
		ld.delete(user);
		
	}

	
	@Override
	public String changePassword(String newPassword) throws ServiceException {
		
		try {
			User user = new User();
			user.setPassword(newPassword);
			ld.update(user);
			return "Password has been Updated Successfully!";
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
		
	}

}
