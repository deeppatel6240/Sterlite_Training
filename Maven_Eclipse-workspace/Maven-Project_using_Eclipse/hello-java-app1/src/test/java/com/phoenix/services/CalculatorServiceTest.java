package com.phoenix.services;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
/*
 * Creation name: deepkumar.sherathiya@stltech.in
 * Date: 22/07/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
import org.junit.Test;

import com.phoenix.math.Calculator;

public class CalculatorServiceTest {
	
	private CalculatorService calciService;
	
	@Before
	public void setUp() {
		calciService = new CalculatorService(new Calculator());
	}
	
	@Test
	public void testAddition() {
		assertEquals(30, calciService.addition(10, 20));
	}

	@After
	public void cleanUp() {
		calciService = null;
	}
}
