package com.phoenix.db;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 23 Aug, 2021
 * Version: 1.0
 * Copyright: STL
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig{
	
	public static Connection getConnection(String jdbcDriver, String jdbcUrl, String dbUsername, String dbPassword) throws ClassNotFoundException, SQLException{
		
		Class.forName(jdbcDriver);
		
		System.out.println("Driver is loaded");
		
		return DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
	}
}