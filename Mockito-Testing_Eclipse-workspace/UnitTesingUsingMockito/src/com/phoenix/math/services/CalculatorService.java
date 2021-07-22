package com.phoenix.math.services;

import com.phoenix.math.Calculator;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 21/07/2021
 * Version: 1.0
 * Copyright: Sterlite Technology Ltd.
 */

// Service class
public class CalculatorService {

	private static Calculator calci;

	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	public CalculatorService(Calculator calci) {
		super();
		this.calci = calci;
	}

	// Application method logic method
	public int addition(int a, int b) {
		return calci.add(a, b);
	}
	
	// Application method logic method
	public int division(int x, int y) {
		return calci.divide(x, y);
	}
}
