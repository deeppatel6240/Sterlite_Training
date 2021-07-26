package com.phoenix.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 06/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

// Persistent class
@Entity
@Table(name = "LOGIN")
public class User {

	// data member of class
	@Id
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;

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

} // end of the class
