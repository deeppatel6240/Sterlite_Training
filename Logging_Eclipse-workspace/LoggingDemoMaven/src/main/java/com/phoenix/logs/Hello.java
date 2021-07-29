package com.phoenix.logs;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 28/07/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {

	private static final Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// special method
		LOGGER.info("This is info message");
		LOGGER.debug("This is debug message");
		LOGGER.warn("This is warn message");
		LOGGER.error("This is error message");

		// generic method
		LOGGER.log(Level.TRACE, "This is trace message");

	}

}
