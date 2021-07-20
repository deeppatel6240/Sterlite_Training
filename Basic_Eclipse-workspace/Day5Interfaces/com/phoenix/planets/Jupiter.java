/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 16/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.planets;

public class Jupiter extends Planet{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter is movable");	
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter is rotatable");
	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter is revolvable");
	}

	@Override
	public boolean supportLife() {
		// TODO Auto-generated method stub
		System.out.println("This is my supportLife method");
		return false;
	}
	
}
//end of the class
