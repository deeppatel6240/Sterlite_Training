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
public class UserAlreadyExistException extends Exception {
	
	private String message;

	public UserAlreadyExistException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserAlreadyExistException [message=" + message + "]";
	}
	
	
}
