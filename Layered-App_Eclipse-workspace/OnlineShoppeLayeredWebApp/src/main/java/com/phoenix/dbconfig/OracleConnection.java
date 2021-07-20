package com.phoenix.dbconfig;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 06/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
import java.sql.Connection;
import java.sql.SQLException;

// Connection establish class
public class OracleConnection {

	// member static method 
	public static Connection getOracleConnection() throws ClassNotFoundException, SQLException {

		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String dbUser = "hr";
		String dbPassword = "hr";

		// return statement
		return DbConfig.getConnection(jdbcDriver, jdbcUrl, dbUser, dbPassword);
	}
} // end of the class
