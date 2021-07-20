/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 16/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable{
	
	//private data member
	private int noOfMoons;

	//getter method
	public int getNoOfMoons() {
		return noOfMoons;
	}

	//setter method
	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}
	
	//protected abstract method
	protected abstract boolean supportLife();
	
	//override toString method
	public String toString() {
		return "No of moons : " + noOfMoons;
	}
	
}
// end of the class
