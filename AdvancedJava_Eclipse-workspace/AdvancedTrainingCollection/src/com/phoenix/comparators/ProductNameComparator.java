package com.phoenix.comparators;

import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		String product1Name = o1.getName();
		String product2Name = o2.getName();
		
		return product1Name.compareTo(product2Name);
	}

}
