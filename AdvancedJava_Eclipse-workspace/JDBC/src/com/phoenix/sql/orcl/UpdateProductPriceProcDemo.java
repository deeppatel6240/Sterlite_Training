package com.phoenix.sql.orcl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.phoenix.dbconfig.OracleConnection;

public class UpdateProductPriceProcDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Connection con = null;

		try {
			con = OracleConnection.getOracleConnection();
			
			CallableStatement cState = con.prepareCall("{call update_product_price(?, ?)}");
			
			cState.setInt(1,  3015);
			cState.setFloat(2, 12000.00f);
			
			cState.execute();
			
			System.out.println("PL/SQL Stored Procedure exceuted sucessfully!");
			
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
