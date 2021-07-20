package com.phoenix.vehicles.main;

import com.phoenix.vehicles.Car;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String variables
		String s1 = "Hello";
		String s2 = "Hello";

		// if else block
		if (s1.equals(s2))
			System.out.println("same contents");
		else
			System.out.println("diff contents");

		// objects of Car
		Car car1 = new Car(100, "bmw", 350000.00f);

		Car car2 = new Car(100, "bmw", 350000.00f);

		// if else block
		if (car1.equals(car2))
			System.out.println("same car");
		else
			System.out.println("diff car");

		// if else block
		if (car1.equals(s2))
			System.out.println("same contents");
		else
			System.out.println("diff contents");

		// string buffer is thread safe
		// string buffer
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		System.out.print("String buffer is: ");

		// The equals method implements an equivalence relation on non-null object
		// references:
		// equals method of object class is compared reference
		// don't try to call equals method to StringBuffer because you will get miss guided output
		if (sb1.equals(sb2))
			System.out.println("same contents");
		else
			System.out.println("diff contents");
	}

} // end of the class
