package com.phoenix.daos;
/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 07/07/2021
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

import com.phoenix.data.Product;
import com.phoenix.dbconfig.OracleConnection;

public class ProductDaoImpl implements ProductDao {

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
	public Product getProductById(int id) throws SQLException {
		// TODO Auto-generated method stub

		// query
		String sql = "SELECT * FROM product WHERE id = ?";

		// Preparing the statement
		PreparedStatement pStmt = con.prepareStatement(sql);

		// setting the user-name in statement
		pStmt.setInt(1, id);

		// resultant statement for execute query received
		ResultSet rs = pStmt.executeQuery();

		if (rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setBrand(rs.getString(3));
			product.setPrice(rs.getFloat(4));
			return product;
		} else {
			return null;
		}
	}

	@Override
	public List<Product> getAllProduct() throws SQLException {
		// TODO Auto-generated method stub
		// Query
		String sql = "SELECT * FROM product";

		// Creating statement
		Statement stmt = con.createStatement();

		// Result that will be received
		ResultSet rs = stmt.executeQuery(sql);

		// array object
		List<Product> products = new ArrayList<Product>();

		while (rs.next()) {
			Product product = new Product();

			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setBrand(rs.getString(3));
			product.setPrice(rs.getFloat(4));

			products.add(product);
		}
		return products;
	}

	@Override
	public void insert(Product product) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO product (id,name,brand,price) VALUES(?,?,?,?)";

		// Preparing the statement
		PreparedStatement pStmt = con.prepareStatement(sql);

		// setting the user-name in statement
		pStmt.setInt(1, product.getId());
		pStmt.setString(2, product.getName());
		pStmt.setString(3, product.getBrand());
		pStmt.setFloat(4, product.getPrice());

		int updateCount = pStmt.executeUpdate();
		if (updateCount > 0) {
			System.out.println("New product added successfully.");
		} else {
			System.out.println("Sorry! product could not be added.");
		}

	}

	@Override
	public void update(Product product) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE product SET price=? WHERE id=?";

		// Preparing the statement
		PreparedStatement pStmt = con.prepareStatement(sql);

		// setting the user-name in statement
		pStmt.setFloat(1, product.getPrice());
		pStmt.setInt(2, product.getId());

		int updateCount = pStmt.executeUpdate();

		if (updateCount > 0) {
			System.out.println("Product updated successfully");
		} else {
			System.out.println("Sorry! Product could not be upadted.");
		}

	}

	@Override
	public void delete(Product product) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM product1 WHERE id=?";
		
		// Preparing the statement
		PreparedStatement pStmt = con.prepareStatement(sql);
		
		// setting the user-name in statement
		pStmt.setInt(1, product.getId());
		
		int updateCount = pStmt.executeUpdate();
		
		if (updateCount > 0) {
			System.out.println("Product Deleted successfully");
		} else {
			System.out.println("Sorry! Product could not be deleted.");
		}

	}

} // end of the class
