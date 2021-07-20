package com.phoenix.entities;
/*
 * @Description
 * 		// It is a POJO class which acts as Persistent class 
 * 		or ENtity class in Hibernate. //
 * 
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 07/07/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

// POJO class
public class Product {

	// instance of class
	private int productId;
	private String productName;
	private String brand;
	private float price;

	// default constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Product(int productId, String productName, String brand, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}

	// setter and getter method
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", price="
				+ price + "]";
	}

} // end of the class
