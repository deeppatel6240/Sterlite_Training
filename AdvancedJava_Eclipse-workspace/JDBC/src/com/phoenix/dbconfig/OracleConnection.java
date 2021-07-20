package com.phoenix.dbconfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnection {
	
	public static Connection getOracleConnection() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		
		//String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		//String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		//String dbUser = "hr";
		//String dbPassword = "hr";
		
		Properties props = new Properties();
		props.load(new FileReader("dbconfig.properties"));
		String jdbcDriver = props.getProperty("driver");
		String jdbcUrl = props.getProperty("url");
		String dbUser = props.getProperty("username");
		String dbPassword = props.getProperty("password");
		
		return DatabaseConfig.getConnection(jdbcDriver, jdbcUrl, dbUser, dbPassword);
	}
}
