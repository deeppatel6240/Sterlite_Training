/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 19/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
	
	// private static data member
	private static PrimeMinister obj;

	private PrimeMinister() {
			System.out.println("Defualt constructor of Prime Minister.");
		}

	public static PrimeMinister getInstance() {
		if (obj == null) {
			obj = new PrimeMinister();
		}
		return obj;
	}

	public void serveNation() {
		System.out.println("Prime Minister serve nation.");
	}
}

//end of the class