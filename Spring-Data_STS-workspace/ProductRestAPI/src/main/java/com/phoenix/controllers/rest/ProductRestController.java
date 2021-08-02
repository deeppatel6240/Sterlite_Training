package com.phoenix.controllers.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phoenix.entities.Product;
import com.phoenix.repositories.ProductRepository;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 2/08/2021 
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 * 
 * description -> restful web services for product resource
 * 					using spring web mvc
 */

@RequestMapping("/products")
@RestController
public class ProductRestController {

	@Autowired
	private ProductRepository productRepo;

	@GetMapping
	public List<Product> getAllProducts() {

		return productRepo.findAll();

	}

	@GetMapping("/{pid}")
	public Object getById(@PathVariable("pid") int id) {
		Optional<Product> op = productRepo.findById(id);
		
		if (op.isPresent()) {
			return op.get();
		} else {
			return "Product not found";
		}
		//return productRepo.findById(id).get();
	}

	// insert new product if new id or update existing product
	@PutMapping
	public String addProduct(@RequestBody Product product) {
		product = productRepo.save(product);
		return "New Product " + product.getId() + " is saved sucessfully!";
	}

	// update existing product
	@PostMapping
	public String updateProduct(@RequestBody Product product) {
		Optional<Product> op = productRepo.findById(product.getId());

		if (op.isPresent()) {
			product = productRepo.save(product);
			return "product " + product.getId() + " is updated sucessfully!";
		} else {
			return "Sorry! product is not found";
		}
	}

	// delete product
	@DeleteMapping
	public String deleteProduct(@RequestBody Product product) {
		Optional<Product> op = productRepo.findById(product.getId());

		if (op.isPresent()) {
			productRepo.delete(product);
			return "product " + product.getId() + " is deleted sucessfully!";
		} else {
			return "Sorry! product is not found";
		}
	}
	
	@PostMapping("/add-form")
	public String addFormData(@RequestParam("nm") String name, @RequestParam("brand") String brand, @RequestParam("price") float price) {
		Product p = new Product();
		p.setName(name);
		p.setBrand(brand);
		p.setPrice(price);
		
		p = productRepo.save(p);
		
		return "Form data with product " + p.getId() + " is added sucessfully!";
	}
	
	@GetMapping("/{nm}/{br}")
	public List<Product> getProductBynameAndBrand(@PathVariable("nm") String name, @PathVariable("br") String brand){
		return productRepo.findByNameAndBrand(name, brand);
	}

	@GetMapping("/{product-name}/{nm}")
	public List<Product> getProductByname(@PathVariable("nm") String name){
		return productRepo.findByName(name);
	}
}
