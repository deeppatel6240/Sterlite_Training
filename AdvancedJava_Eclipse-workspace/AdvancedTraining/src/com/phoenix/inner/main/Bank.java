package com.phoenix.inner.main;

import com.phoenix.inner.Account;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating object of outer class
		Account ac = new Account(1231414, "deep", 1234.353f);
		ac.printDetails();
		
		// creating object of inner class
		Account.Locker ob = ac.new Locker(12, "raj"); 
		ob.unloack();
		ob.keepThings();
		ob.lock();
		
		// creating object of inner class
		Account.Locker ob1 = new Account(1001, "bhargav", 450000.00f).new Locker(1212, "mitesh"); 
		ob1.unloack();
		ob1.keepThings();
		ob1.lock();
	}

} // end of the class
