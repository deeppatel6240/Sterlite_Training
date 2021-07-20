package com.phoenix.web.models;

import java.sql.SQLException;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.exceptions.ServiceException;
import com.phoenix.exceptions.UserNotFoundException;
import com.phoenix.services.LoginService;
import com.phoenix.services.LoginServiceImpl;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 08/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
public class LoginBean {

	// private member of class
	private String username;
	private String password;

	// Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() throws UserNotFoundException, ServiceException, SQLException {

		LoginService loginService = new LoginServiceImpl();
		// LoginDao loginDao = new LoginDaoImpl();
		User dbUser = loginService.findByUserId(username);
		
		//dbUser = loginService.findByUserId(username);
		
		if (dbUser == null) {
			return false;
		} else if (username != null && password != null && dbUser.getUsername() != null && dbUser.getPassword() != null  && username.equals(dbUser.getUsername())
				&& password.equals(dbUser.getPassword())){
			return true;
		} else {
			return false;
		}
		
		
	}
} // end of the class
