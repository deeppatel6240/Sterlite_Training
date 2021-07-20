package com.phoenix.interfaces.functional;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 14/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */

// this is also functional interface cause it's have 
//only one abstract method 
public interface Addable {
	int add(int x, int y);

	default float addFloats(float a, float b) {
		return a + b;
	}

	static void show() {
		System.out.println("Static method");
	}
}
