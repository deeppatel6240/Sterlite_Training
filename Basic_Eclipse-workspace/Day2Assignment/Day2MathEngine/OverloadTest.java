/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MathEngine;

//this is client code used to print overloaded methods
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object of MathEngine class
		MathEngine ob = new MathEngine();
		
		
		//invoking of int method
		System.out.println("this is my int method :" + ob.multiply(10, 20));
		
		//invoking of void method
		ob.multiply(10, 20, 30);
		
		//invoking of float1 method
		System.out.println("this is my float1 method :" + ob.multiply(1f, 20));
		
		//invoking of float2 method
		System.out.println("this is my float2 method :" + ob.multiply(2, 20f));
		
	}
}
// end of the class
