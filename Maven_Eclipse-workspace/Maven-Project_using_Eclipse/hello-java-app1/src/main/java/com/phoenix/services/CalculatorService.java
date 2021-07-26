package com.phoenix.services;
/*
 * Creation name: deepkumar.sherathiya@stltech.in
 * Date: 22/07/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
import com.phoenix.math.Calculator;

public class CalculatorService {

	private Calculator calculator;
	
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	public CalculatorService(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// business logic method
	public int addition(int x, int y) {
		return calculator.add(x, y);
	}
}
