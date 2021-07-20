package com.phoenix.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Factory Method Class
public class DatabaseConfig {
	
	// Factory Method which return connection based of database
	public static Connection getConnection(String jdbcDriver, String jdbcUrl, String userName, String password) throws ClassNotFoundException, SQLException {
		
		// step 1. Load JDBC Driver
		Class.forName(jdbcDriver);
		
		System.out.println("JDBC Driver is loaded");
		
		// step 2. Establish Database Connection
		return DriverManager.getConnection(jdbcUrl, userName, password);
	}
}
