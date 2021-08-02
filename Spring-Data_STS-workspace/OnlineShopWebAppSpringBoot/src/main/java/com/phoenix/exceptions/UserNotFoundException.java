package com.phoenix.exceptions;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 2/08/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * Description:
 *    User define exception
 */
public class UserNotFoundException extends Exception {

	private String message;

	public UserNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserNotFoundException [message=" + message + "]";
	}
		
}
