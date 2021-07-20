/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 16/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("robot can move");
	}
	
	public void processData() {
		System.out.println("robot can also process data");
	}
	
	public void senseInfo() {
		System.out.println("robot can also sense information");
	}
	
	public void useArtificialIntelligence() {
		System.out.println("robot created by using AI");
	}
	
}
// end of the class