package com.phoenix.spring.main;
/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 28/07/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.phoenix.beans.Greeting;
import com.phoenix.spring.config.SpringConfig;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// Obtaining reference to application object from Spring Ioc Container
		Greeting g = context.getBean(Greeting.class);
		
		// Focus on invoking business logic method
		System.out.println(g.greet());
	}

}
