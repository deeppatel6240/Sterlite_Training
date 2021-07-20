/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 19/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.designpatterns.singleton;

public class President {
	
	//private static data member
	private static President obj;
	
	private President() {
		System.out.println("Defualt constructor of President.");
	}
	
	public static President getInstance() {
		if (obj == null) {
			obj = new President();		
		}
		return obj;
	}
	
	public void representNation() {
		System.out.println("president represent nation.");
	}
}
//end of the class