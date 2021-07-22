package com.phoenix.math.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

public class CalculatorServiceTest {

	// must be static if you use BeforeClass and AfterClass annotations
	private static CalculatorService calciService;

	@BeforeClass // if you use BeforeClass then method must be static
	public static void initAll() {
		calciService = new CalculatorService(new Calculator());
	}
	
	// this method should be call before test method
	// initialization logic
	//@Before
	//public void init() {
	//	calciService = new CalculatorService(new Calculator());
	//}

	// must be void and not abstract
	@Test
	public void testAddition() {
		assertEquals(30, calciService.addition(10, 20));
	}

	// must be void and not abstract
	@Test
	public void testDivision() {
		assertEquals(2, calciService.division(10, 5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void checkDivideByZeroException() {
		assertEquals(0, calciService.division(10, 0));
	}

	// clean up logic
	//@After
	//public void clean() {
	//	calciService = null;
	//}
	
	// clean up logic
	@AfterClass // if you use AfterClass then method must be static
	public static void cleanAll() {
		calciService = null;
	}

}
