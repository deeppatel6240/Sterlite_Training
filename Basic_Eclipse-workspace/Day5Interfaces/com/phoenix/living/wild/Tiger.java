/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 16/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.living.wild;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Tiger extends Animal implements Walkable{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Tiger can jump");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tiger can move");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Tiger can run");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Tiger can walk");
	}

}
// end of the class
