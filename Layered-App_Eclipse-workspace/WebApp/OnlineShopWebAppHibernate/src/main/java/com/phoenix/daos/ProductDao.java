/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 9th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.Product;

public interface ProductDao {
	
	// CRUD Methods
	List<Product> getAllProducts();
	Product getProductById(int id);
	void insert(Product product);
	void update(Product product);
	void delete(Product product);

}
