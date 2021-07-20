package com.phoenix.threads.main;

import com.phoenix.models.Account;
import com.phoenix.threads.AccountThread;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1230, "Deep and Pal", 10000);
		
		Thread t1 = new AccountThread(account, true, 3000.00);
		t1.setName("Deep");
		
		Thread t2 = new AccountThread(account, false, 5000.00);
		t2.setName("Pal");
		
		t1.start();
		t2.start();
	}

}
