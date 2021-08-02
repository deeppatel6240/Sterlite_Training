package com.phoenix.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 2/08/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * Description:
 *    Persistent class of Hibernate JPA
 */

@Component
@Entity
@Table(name = "LOGIN")
public class User {
	
	@Id
	private String username;
	private String password;
	
	
	// default constructor
	public User() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	// getter setter method
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

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
}
