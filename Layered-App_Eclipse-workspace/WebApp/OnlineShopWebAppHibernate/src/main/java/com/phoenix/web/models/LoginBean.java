/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package com.phoenix.web.models;

import java.sql.SQLException;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.services.LoginService;
import com.phoenix.services.LoginServiceImpl;
import com.phoenix.web.exceptions.UserNotFoundException;

public class LoginBean {
	
	private String username;
	private String password;
	
	// Setter - Getter Methods
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
	
	// Logic
	public boolean isValid() throws UserNotFoundException{
		
		
		LoginService ls = new LoginServiceImpl();
		User dbUser = ls.findUserById(username);
		
		if(username != null && password != null && dbUser != null && password.equals(dbUser.getPassword()))
			return true;
		else
			return false;
				
	}
	
}
