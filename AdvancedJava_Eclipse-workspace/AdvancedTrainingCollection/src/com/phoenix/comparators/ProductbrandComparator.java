package com.phoenix.comparators;

import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductbrandComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		String product1Brand = o1.getBrand();
		String product2brand = o2.getBrand();
		
		return product1Brand.compareTo(product2brand);
	}

}
