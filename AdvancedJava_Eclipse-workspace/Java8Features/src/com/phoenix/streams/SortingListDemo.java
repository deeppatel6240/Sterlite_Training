package com.phoenix.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.models.Product;

public class SortingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> prodList = new ArrayList<Product>();

		prodList.add(new Product(413, "Mouse", "Sony", 93000.00f));
		prodList.add(new Product(3313, "Mobile", "Oneplus", 87000.00f));
		prodList.add(new Product(5313, "TV", "Samsung", 13000.00f));
		prodList.add(new Product(313, "TV", "Sony", 43000.00f));
		prodList.add(new Product(323, "Fan", "Hevells", 3000.00f));
		prodList.add(new Product(333, "Mobile", "Poco", 13000.00f));
		prodList.add(new Product(343, "Hands Free", "Boat", 500.00f));
		prodList.add(new Product(353, "Headphone", "Boss", 3990.00f));
		prodList.add(new Product(363, "Laptop", "Asus", 243000.00f));
		prodList.add(new Product(373, "Charger", "Mi", 1300.00f));

		Collections.sort(prodList);

		prodList.forEach(System.out::println);

		System.out.println();

		// Java 8
		prodList.sort(Comparator.naturalOrder());
		prodList.forEach(System.out::println);

		System.out.println();

		prodList.sort(Comparator.reverseOrder());
		prodList.forEach(System.out::println);

		System.out.println();

		// Using stream
		System.out.println("Sorted using stream:\n");
		prodList.stream().sorted().forEach(System.out::println);

		System.out.println();

		System.out.println("Reversed Sorted using stream:\n");
		prodList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// Sorting according to ascending order of product name
		System.out.println("\nSorting assecnding acs order of product name");
		prodList.sort(Comparator.comparing(Product::getName));

		System.out.println();

		prodList.forEach(System.out::println);

		// Sorting according to ascending order of product name
		System.out.println("\nSorting assecnding desc order of product name");
		prodList.sort(Comparator.comparing(Product::getName).reversed());

		System.out.println();

		prodList.forEach(System.out::println);

		// Sorting according to ascending order of product name
		System.out.println("\nSorting assecnding acs order of product brand");
		//prodList.sort(Comparator.comparing(Product::getBrand));
		
		// using stream
		prodList.stream()
				.sorted(Comparator.comparing(Product::getBrand))
				.forEach(System.out::println);

		System.out.println();

		//prodList.forEach(System.out::println);

		// Sorting according to ascending order of product name
		System.out.println("\nSorting assecnding desc order of product brand");
		prodList.sort(Comparator.comparing(Product::getBrand).reversed());

		System.out.println();

		prodList.forEach(System.out::println);

		// using stream
		System.out.println("\nSorting assecnding desc order of product name and brand\n");
		prodList.stream()
				.sorted(Comparator.comparing(Product::getName).thenComparing(Product::getBrand, (b1,b2) -> b2.compareTo(b1)))
				.forEach(System.out::println);

	}

}
