/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 9th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.daos.ProductDao;
import com.phoenix.daos.ProductDaoImpl;
import com.phoenix.data.Product;
import com.phoenix.web.exceptions.ProductNotFoundException;
import com.phoenix.web.exceptions.ServiceException;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao pd;
	
	public ProductServiceImpl() {
		pd = new ProductDaoImpl();
	}

	@Override
	public List<Product> findAll() throws ServiceException {
		return pd.getAllProducts();
	}

	@Override
	public Product findProductById(int id) throws ProductNotFoundException {
		Product product = pd.getProductById(id);
		if(product != null)
			return product;
		else
			throw new ProductNotFoundException("Sorry! Product Not Found!!");
	}

	@Override
	public void add(Product product) throws ServiceException {
		pd.insert(product);
		System.out.println("Product is now ready to inserted");
	}

	@Override
	public void edit(Product product) throws ServiceException {
		pd.update(product);

	}

	@Override
	public void remove(Product product) throws ServiceException {
		pd.delete(product);

	}

	@Override
	public List<Product> findByName(String name) throws ServiceException {
		
		List<Product> products = findAll();
		
		System.out.println(name);
		
		List<Product> productsByName = new ArrayList<Product>();
		
		for(Product product: products) {
			
//			String pname1 = product.getName();
			System.out.println(product.getName());
//			String pname2 = name;
//			if(pname1.equals(pname2))
//				productsByName.add(product);
			if(product.getName().equals(name))
				productsByName.add(product);
			
		}
		
		return productsByName;
	}

	@Override
	public List<Product> findByBrand(String brand) throws ServiceException {
		
		List<Product> products = findAll();
		
		List<Product> productsByBrand = new ArrayList<Product>();
		
		for(Product product: products) {
			
			if(product.getBrand().equals(brand))
				productsByBrand.add(product);
			
		}
		
		return productsByBrand;
	}

	@Override
	public List<Product> findByPrice(float price) throws ServiceException {
		
		List<Product> products = findAll();
		
		List<Product> productsByPrice = new ArrayList<Product>();
		
		for(Product product: products) {
			
			if(product.getPrice() == price)
				productsByPrice.add(product);
			
		}
		
		return productsByPrice;
	}

	@Override
	public List<Product> findByPriceRange(float minPrice, float maxPrice) throws ServiceException {
		
		List<Product> products = findAll();
		
		List<Product> productsByPriceRange = new ArrayList<Product>();
		
		for(Product product: products) {
			
			if(product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
				productsByPriceRange.add(product);
			
		}
		
		return productsByPriceRange;
	}

	@Override
	public List<Product> findByNameAndBrand(String name, String brand) throws ServiceException {
		
		List<Product> products = findAll();
		
		List<Product> productsByNameAndBrand = new ArrayList<Product>();
		
		for(Product product: products) {
			
			if(product.getName().equals(name) && product.getBrand().equals(brand))
				productsByNameAndBrand.add(product);
			
		}
		
		return productsByNameAndBrand;
	}

	@Override
	public List<Product> findByNameAndPrice(String name, float price) throws ServiceException {
		
		List<Product> products = findAll();
		
		List<Product> productsByNameAndPrice = new ArrayList<Product>();
		
		for(Product product: products) {
			
			if(product.getName().equals(name) && product.getPrice() == price)
				productsByNameAndPrice.add(product);
			
		}
		
		return productsByNameAndPrice;
		
	}

	@Override
	public List<Product> findByBrandAndPrice(String brand, float price) throws ServiceException {
									
		List<Product> products = findAll();
		
		List<Product> productsByBrandAndPrice = new ArrayList<Product>();
		
		for(Product product: products) {
			
			if(product.getBrand().equals(brand) && product.getPrice() == price)
				productsByBrandAndPrice.add(product);
			
		}
		
		return productsByBrandAndPrice;
		
	}

	@Override
	public List<Product> sortByName() throws ServiceException {
		
		List<Product> products = findAll();
		Stream<Product> filteredStream = products.stream().sorted(Comparator.comparing(Product::getName));
		List<Product> filteredProductList = filteredStream.collect(Collectors.toList());
		return filteredProductList;
		
	}

	@Override
	public List<Product> sortByBrand() throws ServiceException {
		
		List<Product> products = findAll();
		Stream<Product> filteredStream = products.stream().sorted(Comparator.comparing(Product::getBrand));
		List<Product> filteredProductList = filteredStream.collect(Collectors.toList());
		return filteredProductList;
		
	}

	@Override
	public List<Product> sortByPrice() throws ServiceException {
		
		List<Product> products = findAll();
		Stream<Product> filteredStream = products.stream().sorted(Comparator.comparing(Product::getPrice));
		List<Product> filteredProductList = filteredStream.collect(Collectors.toList());
		return filteredProductList;
		
	}

	@Override
	public List<Product> sortByPriceDesc() throws ServiceException {
		
		List<Product> products = findAll();
		Stream<Product> filteredStream = products.stream().sorted(Comparator.comparing(Product::getPrice).reversed());
		List<Product> filteredProductList = filteredStream.collect(Collectors.toList());
		return filteredProductList;
		
	}

}
