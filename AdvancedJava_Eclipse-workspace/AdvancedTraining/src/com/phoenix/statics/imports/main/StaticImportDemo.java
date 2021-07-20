package com.phoenix.statics.imports.main;

import com.phoenix.vehicles.Car;

import static java.lang.Integer.parseInt;
import static com.phoenix.vehicles.Car.count;;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = parseInt("20");
		System.out.println(a);
		
		int b = parseInt("700");
		System.out.println(b);
		
		System.out.println("No of cars: " + count);
		
		Car c1 = new Car();
		Car c2 = new Car(124, "BMW", 12425.23f);
		Car c3 = new Car(124, "BMW", 12425.23f);
		Car c4 = new Car(124, "BMW", 12425.23f);
		Car c5 = new Car(124, "BMW", 12425.23f);
		
		System.out.println("No of cars: " + count);
	}

}
