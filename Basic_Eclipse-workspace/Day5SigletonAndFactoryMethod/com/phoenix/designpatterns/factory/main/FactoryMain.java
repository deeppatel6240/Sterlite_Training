package com.phoenix.designpatterns.factory.main;

import java.util.Scanner;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a car type: ");

		// Creating String
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String car = str.substring(0, 1).toUpperCase() + str.substring(1);

		sc.close();

		Car newCar = CarFactory.newCar(car);
		//System.out.println(newCar); //debug
		newCar.start();
		newCar.run();
		newCar.stop();
	}

}
