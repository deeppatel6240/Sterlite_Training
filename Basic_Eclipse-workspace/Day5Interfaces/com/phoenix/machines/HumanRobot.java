/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 16/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("human robot can jump");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("human robot can run");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("human robot can walk");
	}
	
	public void move() {
		System.out.println("human robot can move");
	}
	
	
}
// end of the class
