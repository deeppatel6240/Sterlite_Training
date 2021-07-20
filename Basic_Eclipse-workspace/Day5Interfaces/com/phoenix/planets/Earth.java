/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 16/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.planets;

public class Earth extends Planet{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Earth is movable");	
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Earth is rotatable");
	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Earth is revolvable");
	}

	@Override
	public boolean supportLife() {
		// TODO Auto-generated method stub
		System.out.println("This is my supportLife method");
		return true;
	}
	
}
// end of the class
