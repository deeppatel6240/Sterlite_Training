package com.phoenix.math.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

class CalculatorServiceTest {

	private static CalculatorService calService;
	
	// this method should be call before test method
	// initialization logic
	//@BeforeEach
	@BeforeAll // if you use BeforeAll then method must be static
	public static void init() {
		
		calService = new CalculatorService(new Calculator());
	}
	
	// must be void and not abstract
	@Test
	public void testAddition() {
		
		int expectedResult = 30;
		int actualResult = calService.addition(10, 20); 
		
		// testing service functionality
		//assertEquals(30, calService.addition(10, 20));
		assertEquals(expectedResult, actualResult);
		
		// it returns red color if actual and expected is same
		//assertNotEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void checkDivison() {
		// testing service functionality
		assertEquals(2, calService.division(10, 5));
	}
	
	@Test
	public void checkDevisionByZeroException() {
		//assertThrows(ArithmeticException.class , Executable);
		assertThrows(ArithmeticException.class, () -> calService.division(10, 0));
	}
	
	// clean up logic
	//@AfterEach
	@AfterAll // if you use AfterAll then method must be static
	public static void clean() {
		
		// clean up
		calService = null;
	}

}
