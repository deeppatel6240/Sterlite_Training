/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 6th July, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.web.exceptions;

public class ProductNotFoundException extends Exception{
	
	private String errorMessage;

	public ProductNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	

}
