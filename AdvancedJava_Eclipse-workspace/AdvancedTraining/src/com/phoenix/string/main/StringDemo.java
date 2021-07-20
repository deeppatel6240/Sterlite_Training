package com.phoenix.string.main;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Version: 1.0
 * Date: 12/07/2021
 * Copyright: Sterlite Technologies Ltd.
 */

import com.phoenix.vehicles.Car;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";

		String s3 = new String("Hello");
		String s4 = "Hello";
		String s5 = new String("Hello");

		// if else block
		if (s1 == s2) {
			System.out.println("Single object");
		} else {
			System.out.println("Different object");
		}

		// if else block
		if (s3 == s4) {
			System.out.println("Single object");
		} else {
			System.out.println("Different object");
		}

		// if else block
		System.out.println("*****Using new keyword******");
		if (s3 == s5) {
			System.out.println("Single object");
		} else {
			System.out.println("Different object");
		}
		System.out.println("***********end************");

		// objects of car
		Car c1 = new Car(123, "Jeep", 450000.00f);

		Car c2 = new Car(123, "Jeep", 450000.00f);

		// if else block (== is used to compare the address of objects)
		if (c1 == c2) {
			System.out.println("Single object");
		} else {
			System.out.println("Different object");
		}
		
		// equals method
		if (s1.equals(s3)) {
			System.out.println("Same contents");
		} else {
			System.out.println("diff contents");
		}

		// if else block (== is used to compare the address of objects)
		/*
		 * if (c1 == s1) { System.out.println("Single object"); } else {
		 * System.out.println("Different object"); }
		 */
		
		// concat method
		String s6 = s1.concat(s3);
		System.out.println("Concat string *******************************");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s6);
		
		// upper case
		String s7 = s1.toUpperCase();
		System.out.println("Upper case *******************************");
		System.out.println(s1);
		System.out.println(s7);
	
		System.out.println("Size of s7: " + s7.length());
		
		System.out.println();
		
		// switch case
		String color = "red";
		
		System.out.print("the color is: ");
		
		switch (color) {
		case "red":
			System.out.println("red color");
			break;
		case "green":
			System.out.println("green color");
			break;
		case "blue":
			System.out.println("blue color");
			break;
			
		default:
			System.out.println("No color");
		}
	}

} // end of the class
