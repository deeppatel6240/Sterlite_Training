package com.phoenix.interfaces.functional;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 15/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.phoenix.models.Product;

public class FunctionalInterfacesDemo {

	public static void main(String[] args) {

		// predicate function
		Predicate<Integer> p = n1 -> n1 > 10;
		boolean result = p.test(12);
		System.out.println(result);

		// predicate function
		Predicate<String> p1 = s -> s.equals("Java");
		System.out.println(p1.test("Java"));
		System.out.println(p1.test("Python"));

		// Consumer function
		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("Welcome to Functional Progamming in JAVA");

		// Consumer function
		Consumer<Integer> c2 = n2 -> System.out.println(n2);
		c2.accept(12345);

		// Supplier function
		Supplier<Double> s1 = () -> 12.453;
		System.out.println(s1.get());

		// Supplier function
		Supplier<String> s2 = () -> "Good night";
		System.out.println(s2.get());

		// Supplier function
		Supplier<ArrayList<Integer>> s3 = ArrayList::new;
		ArrayList<Integer> numList = s3.get();
		System.out.println(numList.size());

		// Consumer function
		Consumer<Integer> c4 = ele -> numList.add(ele);
		c4.accept(100);
		c4.accept(130);
		c4.accept(140);
		c4.accept(150);
		c4.accept(170);
		c4.accept(110);
		c4.accept(120);
		System.out.println(numList.size());

		// Function function
		Function<String, Integer> f1 = s -> Integer.valueOf(s);
		System.out.println(f1.apply("45000"));

		// Supplier function
		Supplier<Product> sProduct = () -> new Product(231, "laptop", "hp", 67999.00f);
		Product product = sProduct.get();
		System.out.println(product);

		// Consumer function
		Consumer<Product> cProduct = pob -> System.out.println(pob);
		cProduct.accept(product);

		// Function function
		Function<Product, Float> fProduct = product1 -> product1.getPrice();
		System.out.println(fProduct.apply(product));

		// Bipredicate function
		BiPredicate<Integer, Double> bp1 = (i, d) -> i >= d;
		System.out.println(bp1.test(123, 123.00));
		System.out.println(bp1.test(12, 1234.98897));

		// BiConsume function
		BiConsumer<Integer, String> bc1 = (i, str) -> System.out.println(i + "\t" + str);
		bc1.accept(100, "Deep");
		bc1.accept(product.getId(), product.getName());

		// Bifunction function
		BiFunction<String, Integer, Boolean> bof1 = (s, n) -> s.equals(n);
		System.out.println(bof1.apply("1000", 1000));

		// Bifunction function
		BiFunction<String, Integer, Boolean> bof2 = (s, n) -> n == Integer.parseInt(s);
		System.out.println(bof2.apply("1000", 1000));
		
		// Unary Operator
		UnaryOperator<String> u1 = s -> s.toUpperCase();
		System.out.println(u1.apply("deep"));
		System.out.println(u1.apply(product.getBrand()));
		
		// binany operator
		BinaryOperator<String> b1 = (s5, s4) -> s5.concat(s4);
		System.out.println(b1.apply("Deep", " Patel"));
		System.out.println(b1.apply(product.getBrand() + " ", product.getName()));

	}
}
