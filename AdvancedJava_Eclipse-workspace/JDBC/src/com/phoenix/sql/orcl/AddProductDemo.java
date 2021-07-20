package com.phoenix.sql.orcl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.phoenix.dbconfig.OracleConnection;

public class AddProductDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = OracleConnection.getOracleConnection();
			
			String sql = "INSERT INTO PRODUCT (id, name, brand, price) VALUES (?, ?, ?, ?)";
			
			PreparedStatement pState = con.prepareStatement(sql);
			
			// insert value in sql String in parameter
			// setter method of prepared statement
			pState.setInt(1, 9453);
			pState.setString(2, "Laptop");
			pState.setString(3, "HP");
			pState.setFloat(4, 45000.00f);
			
			int updateCount = pState.executeUpdate();
			
			if (updateCount > 0) {
				System.out.println("New Product added sucessfully!");
			} else {
				System.out.println("Sorry! Product could not be added");
			}
			
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

} // end of the class
