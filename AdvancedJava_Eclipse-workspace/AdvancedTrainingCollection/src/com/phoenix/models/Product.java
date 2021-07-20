package com.phoenix.models;

public class Product implements Comparable<Product> {

	private int id;
	private String name;
	private String brand;
	private float price;

	public Product() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}

	public int hashCode() {
		return id + name.hashCode() + brand.hashCode() + (int) price;
	}

	public boolean equals(Object ob) {
		if (!(ob instanceof Product)) {
			return false;
		} else {
			Product p = (Product) ob;
			if (this.id == p.id && this.name.equals(p.name) && this.brand.equals(p.brand) && this.price == price) {
				return true;
			} else {
				return false;
			}
		}
	}

}
