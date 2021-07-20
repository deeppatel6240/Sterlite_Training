/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 19/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.designpatterns.singleton;

public class Earth {
	
	//private static data member 
	private static Earth obj;
	
	private Earth() {
		System.out.println("Default Earth Constuctor.");
	}
	
	public static Earth getInstance() {
		if (obj == null) {
			obj = new Earth();
		}
		return obj;
	}
	
	public void createLife() {
		System.out.println("Earth create life.");
	}
}
//end of the class