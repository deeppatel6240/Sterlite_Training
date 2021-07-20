package com.phoenix.models;

public class Account {

	private int accNo;
	private String ownerName;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String ownerName, double balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double currentBalance) {
		this.balance = currentBalance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	// business logic method
	public synchronized void withdraw(double amount) throws InterruptedException {
		double currentBalance = getBalance();
		System.out.println("Balance before withdraw: " + currentBalance 
				+ " seen by " + Thread.currentThread().getName());
		
		currentBalance = currentBalance - amount;
		
		Thread.sleep(1000);
		
		setBalance(currentBalance);
		currentBalance = getBalance();
		
		System.out.println("Balance after withdraw: " + currentBalance 
				+ " seen by " + Thread.currentThread().getName());
		
		Thread.sleep(1000);
	}

}
