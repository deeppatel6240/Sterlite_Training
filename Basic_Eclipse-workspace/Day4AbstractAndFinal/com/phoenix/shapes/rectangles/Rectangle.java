/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape{
	//private data member
	private int length;
	private int breadth;

	// default constructor
	public Rectangle() {
			length = 5;
			breadth = 8;
		}

	// parameterized constructor
	public Rectangle(int length, int breadth) {
			this.length = length;
			this.breadth = breadth;
		}

	// implementation of super class
	public void calculateArea() {
		double area = 0;

		area = length * breadth;

		System.out.println("This is all details display by calculateArea method\n");
		System.out.println("*************************************************\n\n");
		System.out.println("Area of Rectangle is : " + area + "\n");
	}

	// implementation of super class method
	public void calculatePerimeter() {
		double perimeter = 0;

		perimeter = 2 * (length + breadth);

		System.out.println("This is all details display by calculatePerimeter method\n");
		System.out.println("*************************************************\n\n");
		System.out.println("Perimeter of Rectangle is : " + perimeter + "\n");
	}
		
}
// end of the classs
