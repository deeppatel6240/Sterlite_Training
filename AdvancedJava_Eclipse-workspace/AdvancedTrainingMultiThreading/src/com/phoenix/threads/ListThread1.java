package com.phoenix.threads;

import java.util.List;

public class ListThread1 extends Thread {

	List<String> cities;

	public ListThread1() {

	}

	public ListThread1(List<String> cities) {
		super();
		this.cities = cities;
	}

	public void run() {

		try {
			cities.set(1, "chennai");
			System.out.println(cities);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
