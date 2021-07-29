package com.phoenix.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.phoenix.di.config.PerformerConfig;
import com.phoenix.di.performers.Performer;

/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 29/07/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */
public class SterliteIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
					new AnnotationConfigApplicationContext(PerformerConfig.class);
	
		// creating spring ioc container object
		Performer p = context.getBean("instrumentalist", Performer.class);
		
		// invoking business logic method  
		p.perform();

		// creating spring ioc container object
		Performer singer = context.getBean("singer", Performer.class);
		
		// invoking business logic method 
		singer.perform();
	}

}
