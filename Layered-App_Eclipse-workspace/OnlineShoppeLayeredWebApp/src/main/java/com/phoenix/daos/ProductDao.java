package com.phoenix.daos;
/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 07/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.Product;


// DAO class Access object interface 
public interface ProductDao {

	// CRUD operations

	Product getProductById(int id) throws SQLException;

	List<Product> getAllProduct() throws SQLException;

	void insert(Product product) throws SQLException;

	void update(Product product) throws SQLException;

	void delete(Product product) throws SQLException;
} // end of interface
