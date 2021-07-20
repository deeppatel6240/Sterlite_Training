package com.phoenix.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> prodList = new ArrayList<Product>();

		prodList.add(new Product(313, "TV", "Sony", 43000.00f));
		prodList.add(new Product(323, "Fan", "Hevells", 3000.00f));
		prodList.add(new Product(333, "Mobile", "Poco", 13000.00f));
		prodList.add(new Product(343, "Hands Free", "Boat", 500.00f));
		prodList.add(new Product(353, "Headphone", "Boss", 3990.00f));
		prodList.add(new Product(363, "Laptop", "Asus", 243000.00f));
		prodList.add(new Product(373, "Charger", "Mi", 1300.00f));

		Stream<Product> prodStream = prodList.stream();
		Stream<Product> filterProdStream = prodStream.filter(p -> p.getPrice() > 500.00f);

		List<Product> filteredStreamList = filterProdStream.collect(Collectors.toList());

		filteredStreamList.forEach(p -> System.out.println(p));

		// stream pipeline
		List<Product> products = prodList.stream().filter(p -> p.getPrice() > 500.00f)
												  .collect(Collectors.toList());
		
		System.out.println();
		
		products.forEach(System.out::println);
		
		// stream pipleline
		List<Float> prodPrices = prodList.stream().filter(p -> p.getPrice() > 500.00f)
												  .map(product -> product.getPrice())
												  .collect(Collectors.toList());
		
		System.out.println();
		
		prodPrices.forEach(System.out::println);
		
		// no of products
		long prodCount = prodList.stream().count();
		System.out.println("No of products in a list: " + prodCount);
		
		// max price
		Product productMaxprice = prodList.stream()
										.max((p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
										.get();
		System.out.println();
		
		System.out.println("Max product price is:" + productMaxprice);
		
		// min price
		Product productMinprice = prodList.stream()
				.min((p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
				.get();
		
		System.out.println();
		
		System.out.println("Min product priceis: " + productMinprice);
		
		// only printing max price
		float maxPrice = prodList.stream()
								.map(p -> p.getPrice())
								.max((p1,p2) -> p1 > p2 ? 1 : -1)
								.get();
		System.out.println();
		
		System.out.println("only max price of products: " + maxPrice);
											
		// only printing min price
		float minPrice = prodList.stream()
								.map(p -> p.getPrice())
								.min((p1,p2) -> p1 > p2 ? 1 : -1)
								.get();
		System.out.println();
		
		System.out.println("only min price of products: " + minPrice);
		
	}

}
