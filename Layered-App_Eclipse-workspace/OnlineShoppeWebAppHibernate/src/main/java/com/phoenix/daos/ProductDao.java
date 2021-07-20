package com.phoenix.daos;
/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 07/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

import java.util.List;

import com.phoenix.data.Product;


// DAO class Access object interface 
public interface ProductDao {

	// CRUD operations

	Product getProductById(int id);

	List<Product> getAllProduct();

	void insert(Product product);

	void update(Product product);

	void delete(Product product);
} // end of interface
