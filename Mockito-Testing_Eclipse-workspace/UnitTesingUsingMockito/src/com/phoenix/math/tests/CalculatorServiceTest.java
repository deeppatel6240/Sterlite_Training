package com.phoenix.math.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

	@Mock
	private CalculatorService calciService;
	
	@InjectMocks
	private Calculator calculator;
	
	@Before
	public void initService() {
		
		// creating object of calculator service
		//calciService = Mockito.mock(CalculatorService.class);
	
		//calciService = Mockito.spy(CalculatorService.class);
	
		//calciService = Mockito.spy(new CalculatorService());
		
		// creating partial mock - wrapper over real object of class
		//calciService = Mockito.spy(new CalculatorService(new Calculator()));
		
	}
	
	@Test
	public void testAddition() {
		
		// creating mock behavior of mock object
		Mockito.when(calciService.addition(100,200)).thenReturn(300);
		
		// you can not call real method on mock object
		// creating spy behavior on real method
		//Mockito.when(calciService.addition(100, 200)).thenCallRealMethod();
		
		// testing object 
 		assertEquals(300, calciService.addition(100, 200));
	}
	
	@After
	public void cleanService() {
		// cleaning object logic
		calciService = null;
	}

}
