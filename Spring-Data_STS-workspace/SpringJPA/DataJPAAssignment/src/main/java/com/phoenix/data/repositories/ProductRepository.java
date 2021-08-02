package com.phoenix.data.repositories;
import java.util.List;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 30/07/2021 
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.phoenix.data.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	// custom finder method
	List<Product> findByName(String name);
	
	List<Product> findByBrand(String brand);
	
	List<Product> findByPrice(float price);
	
	@Query("select p from Product p where p.name = ?1 and p.price = ?2")
	List<Product> getProductByNameAndPrice(String name, float price);
	
}
