package com.phoenix.exceptions;
/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 08/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
public class ServiceException extends Exception {
	
	private String errorMessage;

	public ServiceException(String errorMessage) {
		super(errorMessage);
	}
}
