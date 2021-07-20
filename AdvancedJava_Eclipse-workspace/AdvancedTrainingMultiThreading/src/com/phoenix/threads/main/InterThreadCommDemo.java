package com.phoenix.threads.main;

import com.phoenix.threads.DataPrinterThread;
import com.phoenix.threads.DataReciverThread;

public class InterThreadCommDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		Thread t1 = new DataPrinterThread(arr);
		Thread t2 = new DataReciverThread(arr);
		
		t1.start();
		t2.start();
	}

}
