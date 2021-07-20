package com.phoenix.dbconfig;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 06/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Factory Method Class
public class DbConfig {
	
	// Factory Method which return connection based of database
	public static Connection getConnection(String jdbcDriver, String jdbcUrl, String dbUser, String dbPassword)
			throws ClassNotFoundException, SQLException {

		// step 1. Load JDBC Driver
		Class.forName(jdbcDriver);

		System.out.println("JDBC driver is loaded");

		// step 2. Establish Database Connection
		return DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

	}
} // end of the class
