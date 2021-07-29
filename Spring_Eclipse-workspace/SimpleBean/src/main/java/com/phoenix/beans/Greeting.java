package com.phoenix.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 28/07/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

// Bean class of spring 
@Component
public class Greeting {

	@Value("Happy Birthday!")
	private String message;
	
	public Greeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Greeting object is created");
	}
	
	// business logic methods 
	public String greet() {
		return message;
	}
}
