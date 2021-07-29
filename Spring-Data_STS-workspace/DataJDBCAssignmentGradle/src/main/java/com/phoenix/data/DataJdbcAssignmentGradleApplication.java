package com.phoenix.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phoenix.data.repositories.ProductRepository;
import com.phoenix.entities.Product;

@SpringBootApplication
public class DataJdbcAssignmentGradleApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DataJdbcAssignmentGradleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Iterable<Product> products = productRepo.findAll();
		
		products.forEach(System.out::println);
	}

}
