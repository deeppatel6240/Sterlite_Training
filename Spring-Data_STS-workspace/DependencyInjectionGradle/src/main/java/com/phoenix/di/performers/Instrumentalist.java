package com.phoenix.di.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.phoenix.di.instruments.Instrument;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 29/07/2021 
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
@Component("Deep_Patel")
public class Instrumentalist implements Performer {

	@Autowired
	private Instrument instrument;
	
	@Value("Awara Hu....")
	private String song;
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing a song: " + song);
		
		// invoking business logic methods
		instrument.play();
	}

}
