package com.phoenix.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Creator Name: deepkumar.sherathya@stltech.in
 * Date: 06/07/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

// persistent class
@Entity
@Table(name = "PRODUCT")
public class Product {

	// data member of class
	@Id
	
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "BRAND")
	private String brand;
	
	@Column(name = "PRICE")
	private float price;

	// default constructor
	public Product() {
		id = 5043;
		name = "laptop";
		brand = "MSI";
		price = 141000.00f;
	}

	// parameterized constructor
	public Product(int id, String name, String brand, float price) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
} // end of the class
