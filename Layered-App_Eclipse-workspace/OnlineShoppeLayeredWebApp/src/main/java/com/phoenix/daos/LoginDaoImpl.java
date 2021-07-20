package com.phoenix.daos;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 06/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phoenix.data.User;
import com.phoenix.dbconfig.OracleConnection;

public class LoginDaoImpl implements LoginDao {

	private static Connection con;

	static {
		try {
			con = OracleConnection.getOracleConnection();
			System.out.println("Database connection is established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM login";

		// statement creation
		Statement stmt = con.createStatement();

		// result set for calling execute query
		ResultSet rs = stmt.executeQuery(sql);

		// list object
		List<User> users = new ArrayList<User>();

		while (rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			users.add(user);
		}

		return users;
	}

	@Override
	public User getUserById(String username) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT username, password FROM login WHERE username=?";

		// prepare statement creation
		PreparedStatement pStmt = con.prepareStatement(sql);
		

		//setting the user-name in statement
		pStmt.setString(1, username);
			
		// result set for calling execute query
		ResultSet rs = pStmt.executeQuery();

		if (rs.next()) {
			User user = new User();
			user.setUsername(rs.getString(1));
			user.setPassword(rs.getString(2));
			return user;
		} else {
			return null;
		}
	}

	@Override
	public void insert(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO login (username, password) VALUES(?,?)";

		// prepare statement creation
		PreparedStatement pStmt = con.prepareStatement(sql);

		pStmt.setString(1, user.getUsername());
		pStmt.setString(2, user.getPassword());

		int updateCount = pStmt.executeUpdate();

		if (updateCount > 0) {
			System.out.println("New User Added Sucessfully");
		} else {
			System.out.println("Sorry! User is not be added");
		}

	}

	@Override
	public void update(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE login SET password=? WHERE username=?";

		// prepare statement creation
		PreparedStatement pStmt = con.prepareStatement(sql);

		pStmt.setString(1, user.getUsername());
		pStmt.setString(2, user.getPassword());

		int updateCount = pStmt.executeUpdate();

		if (updateCount > 0) {
			System.out.println("User password update sucessfully");
		} else {
			System.out.println("Sorry! User password is not be updated");
		}

	}

	@Override
	public void delete(User user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM login WHERE username=?";

		// prepare statement creation
		PreparedStatement pStmt = con.prepareStatement(sql);

		pStmt.setString(1, user.getUsername());

		int updateCount = pStmt.executeUpdate();

		if (updateCount > 0) {
			System.out.println("User deleted sucessfully");
		} else {
			System.out.println("Sorry! User is not be deleted");
		}

	}

} // end of the class
