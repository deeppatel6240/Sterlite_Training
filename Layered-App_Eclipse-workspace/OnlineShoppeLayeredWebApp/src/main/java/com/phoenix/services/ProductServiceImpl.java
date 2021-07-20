package com.phoenix.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		// TODO Auto-generated method stub
		try {
			return productDao.getAllProduct();
		} catch (SQLException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public Product findProductById(int id) throws ProductNotFoundException, ServiceException {
		// TODO Auto-generated method stub
		try {
			return productDao.getProductById(id);
		} catch (SQLException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void add(Product product) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			productDao.insert(product);
		} catch (SQLException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void edit(Product product) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			productDao.update(product);
		} catch (SQLException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void remove(Product product) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			productDao.delete(product);
		} catch (SQLException e) {
			throw new ServiceException(e.getMessage());
		}
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
		return null;
	}

	@Override
	public List<Product> sortByBrand() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> sortByPrice() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> sortByPriceDesc() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
