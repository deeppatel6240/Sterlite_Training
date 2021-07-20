/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape {
	//private data member
	private int side;

	// default constructor
	public Square() {
			side = 5;
		}

	// parameterized constructor
	public Square(int side) {
			this.side = side;
		}

	// implementation of super class
	public void calculateArea() {
		double area = 0;

		area = side * side;
		
		System.out.println("This is all details display by calculateArea method\n");
		System.out.println("*************************************************\n\n");
		System.out.println("Area of Square is : " + area + "\n");
	}

	// implementation of super class method
	public void calculatePerimeter() {
		double perimeter = 0;

		perimeter = 4 * side;
		
		System.out.println("This is all details display by calculatePerimeter method\n");
		System.out.println("*************************************************\n\n");
		System.out.println("Perimeter of Square is : " + perimeter + "\n");
	}
}

// end of the classs
