package com.phoenix.data;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phoenix.data.entities.Product;
import com.phoenix.data.repositories.ProductRepository;

@SpringBootApplication
public class DataJpaAssignmentApplication implements CommandLineRunner {

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

		LOG.info("============================================================");
		LOG.info("============================================================");

		// Get Product by Id

		Optional<Product> productOp = productRepo.findById(3006);

		if (productOp.isPresent()) {
			Product p = productOp.get();
			LOG.debug("Product" + p);
			// System.out.println(p);
		} else {
			LOG.error("Sorry! Product is not found");
		}
		
		LOG.info("============================================================");
		LOG.info("============================================================");
		
		List<Product> gByBrand = productRepo.findByBrand("poco");
		gByBrand.forEach(prodBrand -> LOG.info(prodBrand));
		
		LOG.info("============================================================");
		LOG.info("============================================================");
		
		List<Product> gByNameAndPrice = productRepo.getProductByNameAndPrice("laptop", 50000.0f);
		gByNameAndPrice.forEach(prodNameBrand -> LOG.info(prodNameBrand));
	}

}
