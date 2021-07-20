package com.phoenix.vehicles;

import com.phoenix.annotations.CopyrightInfo;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Version: 1.0
 * Date: 12/07/2021
 * Copyright: Sterlite Technologies Ltd.
 */

// user defined annotations
@CopyrightInfo(copyright = "Sterlite", author = "deepkumar.sherathiya@stltech.in")
public class Car {

	@CopyrightInfo(author = "deep") // ------< not allowed in this location if we declare element.field in user
									// defined annotation interface
	private int id;
	private String model;
	private float price;
	public static int count;

	//@CopyrightInfo(name = "sherathiya")  // ------< not allowed in this location 
	public Car() {
		// TODO Auto-generated constructor stub
		count++;
	}

	public int getId() {
		return id;
	}

	public Car(int id, String model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		count++;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + "]";
	}

	// overriding equals method of object class
	public boolean equals(Object ob) {

		if (ob instanceof Car) {
			Car car = (Car) ob;

			if (this.id == car.id && this.model.equals(car.model) && this.price == car.price)
				return true;
			else
				return false;
		} else {
			return false;
		}

	}

	// overriding hash code method of object class
	public int hashCode() {
		return id + model.hashCode() + (int) price;
	}

} // end of the class
