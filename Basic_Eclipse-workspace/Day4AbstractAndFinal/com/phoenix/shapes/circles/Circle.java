/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape{
	
	//private data member
	private float radius;
	
	//default constructor
	public Circle() {
		radius = 5.0f;
	}
	
	//parameterized constructor
	public Circle(float radius) {
		this.radius = radius;
	}
	
	// implementation of super class
	public void calculateArea() {
		double area = 0;
		
		area = super.MATH_PI * radius * radius;
		
		System.out.println("This is all details display by calculateArea method\n");
		System.out.println("*************************************************\n\n");
		System.out.println("Area of Circle is : " + area + "\n");
	}
	
	//implementation of super class method
	public void calculatePerimeter() {
		double perimeter = 0;
	
		perimeter = super.MATH_PI * radius;
		
		System.out.println("This is all details display by calculatePerimeter method\n");
		System.out.println("*************************************************\n\n");
		System.out.println("Perimeter of Circle is : " + perimeter + "\n");
	}
	
}
// end of the class