/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 19/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.designpatterns.singleton;

public class Sun {
	
	// private static data member
	private static Sun obj;
	public String str;

	private Sun() {
				System.out.println("Defualt constructor of Sun.");
			}

	public static Sun getInstance() {
		if (obj == null) {
			obj = new Sun();
		}
		return obj;
	}

	public void giveLight() {
		System.out.println("Sun provide light.");
	}
}
// end of the class