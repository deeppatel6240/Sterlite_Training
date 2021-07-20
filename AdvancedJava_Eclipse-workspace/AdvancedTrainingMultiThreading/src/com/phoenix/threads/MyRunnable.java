package com.phoenix.threads;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub\
		System.out.println("Current Thread: " + Thread.currentThread().getName());

		List<String> cities = new ArrayList<String>();

		cities.add("London");
		cities.add("Gandhinagar");
		cities.add("Rajkot");
		cities.add("Maxico");
		cities.add("Dubai");

		cities.forEach(System.out::println);
	}

}
