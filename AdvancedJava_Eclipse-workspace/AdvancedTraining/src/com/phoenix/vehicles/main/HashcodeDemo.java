package com.phoenix.vehicles.main;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Version: 1.0
 * Date: 12/07/2021
 * Copyright: Sterlite Technologies Ltd.
 */

import com.phoenix.vehicles.Car;

public class HashcodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object of predefined string class
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = new String("Deep");

		// print hash code of s1 object
		System.out.println("Hash code of s1: " + s1.hashCode());

		// print hash code of s2 object
		System.out.println("Hash code of s2: " + s2.hashCode());

		// print hash code of s3 object
		System.out.println("Hash code of s3: " + s3.hashCode());

		// objects of car
		Car c1 = new Car(123, "Jeep", 450000.00f);

		Car c2 = new Car(123, "Jeep", 450000.00f);

		Car c3 = new Car(123, "Honda", 450000.00f);

		// print hash code of c1 object
		System.out.println("Hash code of c1: " + c1.hashCode());

		// print hash code of c2 object
		System.out.println("Hash code of c2: " + c2.hashCode());

		// print hash code of c1 object
		System.out.println("Hash code of c3: " + c3.hashCode());
	}

}
