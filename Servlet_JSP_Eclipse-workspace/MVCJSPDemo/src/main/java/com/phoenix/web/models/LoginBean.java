package com.phoenix.web.models;

/*
 * @author deepkumar.sherathiya@stltech.in
 * @version 1.0
 * Date : 27/06/2021
 * copyright : Sterlite Technologies Ltd.
 */


// JavaBean class
// model - fouces on business logic in MVC Design pattern
public class LoginBean {
	
	private String username;
	private String password;
	
	//getter method
	public String getUsername() {
		return username;
	}
	
	//setter method
	public void setUsername(String username) {
		this.username = username;
	}
	
	//getter method
	public String getPassword() {
		return password;
	}
	
	//setter method
	public void setPassword(String password) {
		this.password = password;
	}
	
	//business logic
	public boolean isValid() {
		if(username != null && password != null 
				&& username.equals("deep") &&
				password.equals("deep12")) {
			return true;
		} else {
			return false;
		}
	}
}
//end of the class
