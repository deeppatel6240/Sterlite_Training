package com.phoenix.data;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phoenix.data.repositories.ProductRepository;
import com.phoenix.entities.Product;

@SpringBootApplication
public class DataJdbcAssignmentApplication implements CommandLineRunner {

	private static final Logger LOG = LogManager.getLogger();

	@Autowired
	private ProductRepository productRepo;

	public static void main(String[] args) {
		SpringApplication.run(DataJdbcAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Iterable<Product> products = productRepo.findAll();

		// invoking business logic method
		//products.forEach(System.out::println);
		products.forEach(product -> LOG.info(product));

		LOG.info("=========================================================");
		LOG.info("=========================================================");
		// Get Product by Id
		/*
		Optional<Product> productOp = productRepo.findById(3006);

		if (productOp.isPresent()) {
			Product p = productOp.get();
			LOG.debug("Product" + p);
			// System.out.println(p);
		} else {
			LOG.error("Sorry! Product is not found");
		}

		LOG.info("=========================================================");
		LOG.info("=========================================================");

		// count number of product
		LOG.info("No of Products: " + productRepo.count());

		// update product by changing the price
		productOp = productRepo.findById(3006);

		if (productOp.isPresent()) {
			Product p = productOp.get();
			float oldPrice = p.getPrice();

			p.setPrice(p.getPrice() + 10000.00f);
			productRepo.save(p);

			float newPrice = p.getPrice();

			LOG.debug("Product " + p.getId() + " updated sucessfully!");

			LOG.info("Old Price: " + oldPrice);
			LOG.info("New Price: " + newPrice);
			// System.out.println(p);
		} else {
			LOG.error("Sorry! Product is not found");
		}

		LOG.info("=========================================================");
		LOG.info("=========================================================");

		// delete the product from table

		productOp = productRepo.findById(3014);

		if (productOp.isPresent()) {
			Product p = productOp.get();
			productRepo.delete(p);
			LOG.debug("Product " + p.getId() + " deleted sucessfully!"); // System.out.println(p); } else {
			LOG.error("Sorry! Product is not found");
		}

		LOG.info("=========================================================");
		LOG.info("=========================================================");

		// insert the product into table
		Product product = new Product();
		product.setId(1111);
		product.setName("HP");
		product.setBrand("Gaming-Laptop");
		product.setPrice(141000.00f);

		product.setInsert(true); // setting true to insert the record rather update 
		
		productRepo.save(product);
		LOG.info("New Product " + product.getId() + " inserted sucessfully!");
		*/
		
		List<Product> pByName = productRepo.findByName("Laptop");
		pByName.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> pByBrand = productRepo.findByBrand("HP");
		pByBrand.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> pByPrice = productRepo.findByPrice(34000.00f);
		pByPrice.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> pByPriceRange = productRepo.findByPriceBetween(100000.00f, 200000.0f);
		pByPriceRange.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");

		List<Product> pByNameBrand = productRepo.findByNameAndBrand("iphone 11", "apple");
		pByNameBrand.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> pByNamePrice = productRepo.findByNameAndPrice("3014", 34000.0f);
		pByNamePrice.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> pByBrandPrice = productRepo.findByBrandAndPrice("poco", 34000.0f);
		pByBrandPrice.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> pByNameLike = productRepo.findByNameLike("%l%");
		pByNameLike.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> pByNameOByPrice = productRepo.findByNameOrderByPrice("Laptop");
		pByNameOByPrice.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> pByNameOByPriceD = productRepo.findByNameOrderByPriceDesc("Laptop");
		pByNameOByPriceD.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> sByBrand = productRepo.OrderByBrand();
		sByBrand.forEach(product -> LOG.info(product));
	
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> sByName = productRepo.sortByName();
		sByName.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		List<Product> gByNamePrice = productRepo.getProductByNameAndPrice("HP", 141000.00f);
		gByNamePrice.forEach(product -> LOG.info(product));
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		int uByPriceBrand = productRepo.updatePriceByBrand("TV", 141000.00f);
		LOG.info("No of products updated: " + uByPriceBrand);
		
		LOG.info("=========================================================");
		LOG.info("=========================================================");
		
		boolean dByName = productRepo.deleteProductByName("null");
		LOG.info("Priduct is deleted or not: " + dByName);
	}

}
