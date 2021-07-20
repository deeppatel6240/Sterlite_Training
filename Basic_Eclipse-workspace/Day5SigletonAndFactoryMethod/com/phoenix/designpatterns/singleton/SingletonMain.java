/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 19/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sun
		
		Sun sun = Sun.getInstance();
		sun.giveLight();
		System.out.println("****************************************\n\n");
		
		// Earth

		Earth earth = Earth.getInstance();
		earth.createLife();
		System.out.println("****************************************\n\n");

		// Prime Minister

		PrimeMinister pm = PrimeMinister.getInstance();
		pm.serveNation();
		System.out.println("****************************************\n\n");

		// President

		President ps = President.getInstance();
		ps.representNation();
		System.out.println("****************************************\n\n");
	}

}
