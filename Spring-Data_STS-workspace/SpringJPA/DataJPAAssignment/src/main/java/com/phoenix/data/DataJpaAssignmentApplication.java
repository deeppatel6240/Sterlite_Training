package com.phoenix.data;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phoenix.data.entities.Product;
import com.phoenix.data.repositories.ProductRepository;

@SpringBootApplication
public class DataJpaAssignmentApplication implements CommandLineRunner{

	private static final Logger LOG = LogManager.getLogger();
	
	@Autowired
	private ProductRepository productRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DataJpaAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// find All
		Iterable<Product> product = productRepo.findAll();
		product.forEach(prod -> LOG.info(prod));
		
		// count no of products
		LOG.info("No of Products: " + productRepo.count());
		
		LOG.info("============================================================");
		LOG.info("============================================================");
		
		List<Product> products = productRepo.findByName("Laptop");
		products.forEach(product1 -> LOG.info(product1));
	}

}
