package com.phoenix.sql.orcl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.phoenix.dbconfig.OracleConnection;

public class GetEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;

		try {
			con = OracleConnection.getOracleConnection();
			
			Statement stmt = con.createStatement();
			
			String sql = "SELECT employee_id, first_name, salary FROM EMPLOYEES";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int empId = rs.getInt(1);
				String firstName = rs.getString("first_name");
				float sal = rs.getFloat("salary");
				
				System.out.println("EMpi Id: " + empId +
									"\tFirst Name: " + firstName +
									"\tSalary: " + sal);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
