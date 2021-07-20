package com.phoenix.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @Description
 * 		// It is a POJO class which acts as Persistent class 
 * 		or ENtity class in Hibernate. 
 * 		It uses JPA annotations.//
 * 
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 07/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

// Entity class
@Entity
@Table(name = "PRODUCT") // write this annotation if class name is not same as table name.

public class Product {

	// instance of class
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "ID")
	private int productId;
	
	@Column(name = "NAME")
	private String productName;
	
	@Column(name = "BRAND")
	private String brand;
	
	@Column(name = "PRICE")
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
