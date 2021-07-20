//my pack
package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.cars.Car;

/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 17/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */


public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference
		Movable movable;
		
		//Earth object
		
		
		System.out.println("********Earth object ********");
		movable = new Earth();
		
		//Moons
		((Earth) movable).setNoOfMoons(2);
		
		//toString
		String earthStr = movable.toString();
		System.out.println(earthStr);
		
		//boolean
		if (((Earth)movable).supportLife()) {
			System.out.println("planet support life");
		} else {
			System.out.println("planet does not support life");
		}
		
		System.out.println();
		
		//Jupiter object
		
		
		System.out.println("************Jupiter object**********");
		movable = new Jupiter();
		
		//Moons
		((Jupiter) movable).setNoOfMoons(79);
		
		//toString
		String jupiterStr = movable.toString();
		System.out.println(jupiterStr);
		
		//boolean
		if (((Jupiter) movable).supportLife()) {
			System.out.println("planet support life");
		} else {
			System.out.println("planet does not support life");
		}
		
		System.out.println();
		
		//tiger object
		
		
		System.out.println("***********Tiger object***********");
		movable = new Tiger();
		
		//jump
		((Tiger)movable).jump();
		
		//Move
		movable.move();
		
		//run
		((Tiger)movable).run();
		
		//walk
		((Tiger)movable).walk();
		
		System.out.println();
		
		// cat object
		

		System.out.println("***********Cat object***********");
		movable = new Cat();

		// jump
		((Cat)movable).jump();

		// Move
		movable.move();

		// run
		((Cat) movable).run();

		// walk
		((Cat) movable).walk();
		
		System.out.println();

		// car object
		

		System.out.println("***********Car object***********");
		movable = new Car();

		// start
		((Car) movable).start();

		// stop
		((Car) movable).stop();

		// run
		((Car) movable).run();

		// move
		((Car) movable).move();
		
		System.out.println();
		
		// human robot object
		
		System.out.println("************Human Robot object**************");
		movable = new HumanRobot();
		
		//jump
		((HumanRobot)movable).jump();
		
		//run
		((HumanRobot)movable).run();
		
		//walk
		((HumanRobot)movable).walk();		

		//move
		((HumanRobot)movable).move();		
		
		//process data
		((HumanRobot)movable).processData();
		
		//sense information
		((HumanRobot)movable).senseInfo();
		
		//useAi
		((HumanRobot)movable).useArtificialIntelligence();
	}

}

//end of the class
