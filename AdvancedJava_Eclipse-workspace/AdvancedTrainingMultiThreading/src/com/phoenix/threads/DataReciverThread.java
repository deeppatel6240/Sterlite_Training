package com.phoenix.threads;

import java.util.Scanner;

public class DataReciverThread extends Thread {

	int[] arr;

	public DataReciverThread(int[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (arr) {
			try {

				Scanner sc = new Scanner(System.in);

				for (int i = 0; i < arr.length; i++) {
					System.out.println("Enter data: ");
					int data = sc.nextInt();
					arr[i] = data;
					Thread.sleep(200);
				}

				arr.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
