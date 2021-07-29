package com.phoenix.di.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 29/07/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */
@Component()
public class Singer implements Performer {
	
	@Value("fireflies....")
	private String song;
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Singer is singing a song: " + song);
	}

}
