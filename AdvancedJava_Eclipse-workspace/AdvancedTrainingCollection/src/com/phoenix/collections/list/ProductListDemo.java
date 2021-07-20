package com.phoenix.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.comparators.ProductNameComparator;
import com.phoenix.comparators.ProductbrandComparator;
import com.phoenix.models.Product;

public class ProductListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(1002, "Mobile", "Samsung", 18000.00f));
		productList.add(new Product(1003, "Laptop", "Asus rog", 38000.00f));
		productList.add(new Product(1056, "Tablet", "Apple", 68000.00f));
		productList.add(new Product(1032, "Mobile", "Sony", 28000.00f));
		productList.add(new Product(1089, "Mobile", "Samsung", 43000.00f));

		System.out.println("Before sorting");
		for (Product product : productList) {
			System.out.println(product);
		}

		Collections.sort(productList);
		System.out.println("sorting according to id asc");
		for (Product product : productList) {
			System.out.println(product);
		}

		Collections.sort(productList, Collections.reverseOrder());

		System.out.println("sorting according to id desc");
		for (Product product : productList) {
			System.out.println(product);
		}
		
		Comparator<Product> cNm = new ProductNameComparator();
		Collections.sort(productList, cNm);

		System.out.println("sorting according to name asc");
		for (Product product : productList) {
			System.out.println(product);
		}

		Collections.sort(productList, cNm.reversed());
		
		// before 1.8 version
		//Collections.sort(productList, Collections.reverseOrder(cNm));

		System.out.println("sorting according to name desc");
		for (Product product : productList) {
			System.out.println(product);
		}
		
		Comparator<Product> cBrand = new ProductbrandComparator();
		Collections.sort(productList, cBrand);

		System.out.println("sorting according to name asc");
		for (Product product : productList) {
			System.out.println(product);
		}

		Collections.sort(productList, cBrand.reversed());

		System.out.println("sorting according to name desc");
		for (Product product : productList) {
			System.out.println(product);
		}
	}

}
