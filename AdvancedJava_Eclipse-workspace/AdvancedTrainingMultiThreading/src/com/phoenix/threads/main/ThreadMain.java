package com.phoenix.threads.main;

import com.phoenix.threads.MyThread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();

		t1.setName("Deep");
		t2.setName("Pal");
		
		//t1.setPriority(2);
		//t2.setPriority(10);
		
		t1.start();
		t2.start();
	}

}
