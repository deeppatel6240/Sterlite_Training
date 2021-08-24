package com.phoenix.db;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 23 Aug, 2021
 * Version: 1.0
 * Copyright: STL
 */

import java.sql.Connection;
import java.sql.SQLException;

public class MySQLConnection {
	
	public static Connection getMySqlConnection() throws ClassNotFoundException, SQLException {
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost:3306/STL";
		String dbUsername = "root";
		String dbPassword = "Deep@v24";
		
		return DBConfig.getConnection(jdbcDriver, jdbcUrl, dbUsername, dbPassword);
		
	}
}
