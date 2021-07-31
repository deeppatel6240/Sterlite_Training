package com.phoenix.data.repositories;
import java.util.List;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 30/07/2021 
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.phoenix.data.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	// custom finder method
	List<Product> findByName(String name);
	
}
