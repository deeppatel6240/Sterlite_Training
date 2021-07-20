/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 16/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car is running");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car can move");
	}
	
	public void start() {
		System.out.println("Car is start");
	}
	
	public void stop() {
		System.out.println("Car is stop");
	}
	
}
//end of the class
