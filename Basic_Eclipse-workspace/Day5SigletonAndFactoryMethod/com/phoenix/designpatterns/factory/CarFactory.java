/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 19/06/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

//my pack
package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {

	static String arr[] = { "Sedan", "Sport", "Couple", "Luxury" };

	public static Car newCar(String carType) {
		Car newCar = null;
		if (carType.equals(arr[0])) {
			newCar = new SedanCar();
		} else if (carType.equals(arr[1])) {
			newCar = new SportCar();
		} else if (carType.equals(arr[2])) {
			newCar = new CoupleCar();
		} else if (carType.equals(arr[3])) {
			newCar = new LuxuryCar();
		} else {
			newCar = null;
		}
		return newCar;
	}
}
