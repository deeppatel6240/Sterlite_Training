package com.phoenix.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 08/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
import com.phoenix.daos.ProductDao;
import com.phoenix.daos.ProductDaoImpl;
import com.phoenix.data.Product;
import com.phoenix.exceptions.ProductNotFoundException;
import com.phoenix.exceptions.ServiceException;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
		productDao = new ProductDaoImpl();
	}

	@Override
	public List<Product> findAll() throws ServiceException {
		return productDao.getAllProduct();
	}

	@Override
	public Product findProductById(int id) throws ProductNotFoundException {
		Product product =  productDao.getProductById(id);
		
		if (product != null) {
			return product;
		} else {
			throw new ProductNotFoundException("Sorry! product is not found");
		}
	}

	@Override
	public void add(Product product) throws ServiceException {
		productDao.insert(product);
	}

	@Override
	public void edit(Product product) throws ServiceException {
		productDao.update(product);
	}

	@Override
	public void remove(Product product) throws ServiceException {
		productDao.delete(product);
	}

	@Override
	public List<Product> findByName(String name) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productsByName = new ArrayList<Product>();
		for(Product product : dbProducts) {
			
			if(product.getName().equals(name)) {
				productsByName.add(product);
			}
		}
		
		return productsByName;
	}

	@Override
	public List<Product> findByBrand(String brand) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productsByBrand = new ArrayList<Product>();
		
		for(Product product : dbProducts) {
			
			if(product.getBrand().equals(brand)) {
				productsByBrand.add(product);
			}
		}
		return productsByBrand;
	}

	@Override
	public List<Product> findByPrice(float price) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productsByPrice = new ArrayList<Product>();
		
		for(Product product : dbProducts) {
		
			if(product.getPrice() == price) {
				productsByPrice.add(product);
			}
		}
		return productsByPrice;
	}

	@Override
	public List<Product> findByPriceRange(float minPrice, float maxPrice) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productsByPriceRange = new ArrayList<Product>();
		
		for(Product product : dbProducts) {
		
			if(product.getPrice() >= maxPrice && product.getPrice() <= minPrice) {
				productsByPriceRange.add(product);
			}
		}
		return productsByPriceRange;
	}

	@Override
	public List<Product> findByNameAndBrand(String name, String brand) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productsByBrand = new ArrayList<Product>();
		
		for(Product product : dbProducts) {
		
			if(product.getBrand().equals(brand)) {
				productsByBrand.add(product);
			}
		}
		return productsByBrand;
	}
	

	@Override
	public List<Product> findByNameAndPrice(String name, float price) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productsByNameAndPrice = new ArrayList<Product>();
		
		for(Product product : dbProducts) {
		
			if(product.getName().equals(name) && product.getPrice() == price) {
				productsByNameAndPrice.add(product);
			}
		}
		return productsByNameAndPrice;
	}

	@Override
	public List<Product> findBrandAndPrice(String brand, float price) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		
		List<Product> productsByBrandAndPrice = new ArrayList<Product>();
		
		for(Product product : dbProducts) {
		
			if(product.getBrand().equals(brand) && product.getPrice() == price) {
				productsByBrandAndPrice.add(product);
			}
		}
		return productsByBrandAndPrice;
	}

	@Override
	public List<Product> sortByName() throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> prodList = findAll();
		
		List<Product> productSortedByName = new ArrayList<Product>();
		
		prodList.sort(Comparator.comparing(Product::getName));
		
		for (Product product : prodList) {
			productSortedByName.add(product);
		}
		
		return productSortedByName;
	}

	@Override
	public List<Product> sortByBrand() throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> prodList = findAll();
		/*
		 * List<Product> prodList = sortByBrand();
		 * 
		 * List<Product> productSortedbyBrand = new ArrayList<Product>();
		 * 
		 * prodList.sort(Comparator.comparing(Product::getBrand));
		 * 
		 * for (Product product : prodList) { productSortedbyBrand.add(product); }
		 * 
		 * return productSortedbyBrand;
		 */
		prodList.stream()
		.sorted(Comparator.comparing(Product::getBrand))
		.forEach(System.out::println);
		
		return prodList;
	}

	@Override
	public List<Product> sortByPrice() throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> prodList = findAll();
		
		List<Product> productSortedbyPrice = new ArrayList<Product>();
		
		prodList.sort(Comparator.comparing(Product::getPrice));
		
		for (Product product : prodList) {
			productSortedbyPrice.add(product);
		}
		
		return productSortedbyPrice;
	}

	@Override
	public List<Product> sortByPriceDesc() throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> prodList = findAll();
		
		List<Product> productSortedbyPriceDesc = new ArrayList<Product>();
		
		prodList.sort(Comparator.comparing(Product::getPrice).reversed());
		
		for (Product product : prodList) {
			productSortedbyPriceDesc.add(product);
		}
		
		return productSortedbyPriceDesc;
	}

}
