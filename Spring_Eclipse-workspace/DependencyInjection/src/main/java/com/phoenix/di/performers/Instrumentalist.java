package com.phoenix.di.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.phoenix.di.instruments.Instrument;

/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 29/07/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 * 
 * desc: Instrumentalist is a dependent object which depends on 
 * 		 dependency object Instrument.
 */

// class
@Component()
public class Instrumentalist implements Performer {
	
	// Dependency
	@Autowired // -> used to achieve Dependency Injection for complex property
	private Instrument instrument;
	
	// simple property which is simple type
	@Value("Enchanted to meet you.....") // -> used to Inject values in simple property
	private String song;

	public Instrumentalist() {
		// TODO Auto-generated constructor stub
		System.out.println("Instrumentalist is created");
	}
	
	// Business logic method of Performer
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing a song: " + song);
		instrument.play();
	}

}
