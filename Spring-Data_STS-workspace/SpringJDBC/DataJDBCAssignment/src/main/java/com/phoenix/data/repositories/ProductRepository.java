package com.phoenix.data.repositories;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 29/07/2021 
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * Description: DAO Interface or Repositories Interface
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phoenix.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	// custom finder methods
	List<Product> findByName(String name);
	
	List<Product> findByBrand(String brand);
	
	List<Product> findByPrice(float price);
	
	List<Product> findByPriceBetween(float minPrice, float maxPerice);
	
	List<Product> findByNameAndBrand(String name, String brand);
	
	List<Product> findByNameAndPrice(String name, float price);
	
	List<Product> findByBrandAndPrice(String brand, float price);
	
	List<Product> findByNameLike(String name);
	
	List<Product> findByNameOrderByPrice(String name);
	
	List<Product> findByNameOrderByPriceDesc(String name);
	
	List<Product> OrderByBrand();
	
	@Query("select * from product order by name")
	List<Product> sortByName();
	
	@Query("select * from product where name = :nm and price = :pr")
	List<Product> getProductByNameAndPrice(@Param("nm") String name, @Param("pr") float price);
	
	@Modifying
	@Query("update product set price = price + :pr where brand = :br")
	int updatePriceByBrand(@Param("br") String brand, @Param("pr") float price);
	
	@Modifying
	@Query("delete from product where name = :nm")
	boolean deleteProductByName(@Param("nm") String name);
}
