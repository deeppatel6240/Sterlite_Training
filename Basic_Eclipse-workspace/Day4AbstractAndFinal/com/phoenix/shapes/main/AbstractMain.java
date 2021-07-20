/*
 * creator Name: deepkumar.sherathiya@stltech.in
 * Date: 11/06/2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference of super class
		Shape ref1;
		
		// object of circle class using reference of super class
		ref1 = new Circle(2.5f);
		
		//invoking method 
		ref1.calculateArea();
		ref1.calculatePerimeter();
	
		// object of Rectangle class using reference of super class
		ref1 = new Rectangle(4, 6);
		
		//invoking method 
		ref1.calculateArea();
		ref1.calculatePerimeter();
		
		// object of Square class using reference of super class
		ref1 = new Square(10);
		
		//invoking method 
		ref1.calculateArea();
		ref1.calculatePerimeter();
	}

}
// end of the class