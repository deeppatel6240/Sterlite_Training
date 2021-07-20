package com.phoenix.collections.set;

import java.util.HashSet;
import java.util.Set;

import com.phoenix.models.Product;

public class ProductSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> productSet = new HashSet<Product>();

		productSet.add(new Product(1002, "Mobile", "Samsung", 18000.00f));
		productSet.add(new Product(1003, "Laptop", "Asus rog", 38000.00f));
		productSet.add(new Product(1056, "Tablet", "Apple", 68000.00f));
		productSet.add(new Product(1032, "Mobile", "Sony", 28000.00f));
		productSet.add(new Product(1089, "Mobile", "Samsung", 43000.00f));
		productSet.add(new Product(1089, "Mobile", "Samsung", 43000.00f));
		productSet.add(new Product(1089, "Mobile", "Samsung", 43000.00f));
		productSet.add(new Product(1089, "Mobile", "Samsung", 43000.00f));
		productSet.add(new Product(1089, "Mobile", "Samsung", 43000.00f));

		for (Product product : productSet) {
			System.out.println(product);
		}

	}

}
