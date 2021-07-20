/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MathEngine;

//This is my class representing date entity
public class MathEngine {
	
	//member methods
	
	
	//int method
	public int multiply(int a, int b) {
		return a * b;
	}
	
	//void method
	public void multiply(int a, int b, int c) {
		System.out.println("this is my void method :" + a * b * c);
	}
	
	//float1 method
	public float multiply(float a, int b){
		return a * b;
		
	}
	
	//float2 method
	public float multiply(int a, float b) {
		return a * b;
	}
}
//end of the class
