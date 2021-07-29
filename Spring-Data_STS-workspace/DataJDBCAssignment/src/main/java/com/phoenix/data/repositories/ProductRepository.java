package com.phoenix.data.repositories;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 29/07/2021 
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * Description: DAO Interface or Repositories Interface
 */
import org.springframework.data.repository.CrudRepository;

import com.phoenix.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
}
