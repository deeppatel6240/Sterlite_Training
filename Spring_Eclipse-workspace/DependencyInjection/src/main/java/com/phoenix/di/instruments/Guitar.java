package com.phoenix.di.instruments;
/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 29/07/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

import org.springframework.stereotype.Component;

// class
@Component
public class Guitar implements Instrument {

	public Guitar() {
		// TODO Auto-generated constructor stub
		System.out.println("Guitar is created");
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Ting ting ting......");
	}

}
