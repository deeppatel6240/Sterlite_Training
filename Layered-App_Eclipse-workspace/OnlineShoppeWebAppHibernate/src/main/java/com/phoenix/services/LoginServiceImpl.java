package com.phoenix.services;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 08/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.exceptions.ServiceException;
import com.phoenix.exceptions.UserAlreadyExistException;
import com.phoenix.exceptions.UserNotFoundException;

public class LoginServiceImpl implements LoginService {

	// DAO Interface
	private LoginDao loginDao;
	
	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
		loginDao = new LoginDaoImpl();
	}

	@Override
	public List<User> findAll() throws ServiceException {
		return loginDao.getAll();

	}

	@Override
	public User findByUserId(String username) throws UserNotFoundException {
		User user = loginDao.getUserById(username);
		
		if (user != null) {
			return user;
		} else {
			throw new UserNotFoundException("User Does not Exist");
		}
	}

	@Override
	public void add(User user) throws UserAlreadyExistException {
		loginDao.insert(user);
	}

	@Override
	public void edit(User user) throws ServiceException {
		loginDao.update(user);
	}

	@Override
	public void remove(User user) throws ServiceException {
		loginDao.delete(user);
	}

	@Override
	public String changePassword(String newPassword) throws ServiceException {
		// TODO Auto-generated method stub
		
		User user = new User();
		
		user.setPassword(newPassword);
		
		loginDao.update(user);
		return "Password is updated.";
	}

} // end the class
