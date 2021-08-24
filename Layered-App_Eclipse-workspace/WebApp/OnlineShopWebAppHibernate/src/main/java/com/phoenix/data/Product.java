/*
 * 	Author : manan.panchal.stltech.in
 *  Date of Creation : 9th July, 2021
 * 	Version : 2.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Value Object Class - Java Bena Class - POJO Class or Persistent Class or Entity Class

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	private int id;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String brand, float price) {
		super();
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
	
}
