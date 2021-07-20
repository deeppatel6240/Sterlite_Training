package com.phoenix.sql;

import java.sql.Connection;
import java.sql.SQLException;

import com.phoenix.dbconfig.DatabaseConfig;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String dbUser = "hr";
		String dbPassword = "hr";

		Connection con = null;

		try {
			con = DatabaseConfig.getConnection(jdbcDriver, jdbcUrl, dbUser, dbPassword);
			System.out.println("Database connection is established");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
