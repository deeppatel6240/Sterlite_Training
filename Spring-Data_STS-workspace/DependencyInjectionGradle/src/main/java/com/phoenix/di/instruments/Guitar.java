package com.phoenix.di.instruments;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 29/07/2021 
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
import org.springframework.stereotype.Component;

// Bean class
@Component
public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub	
		System.out.println("Ting ting ting.....");
	}

}
