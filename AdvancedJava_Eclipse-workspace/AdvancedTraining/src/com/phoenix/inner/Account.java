package com.phoenix.inner;

public class Account {

	private int accNo;
	private String ownerName;
	private float balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String ownerName, float balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void printDetails() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

	// simple inner class of Account
	public class Locker {

		private int lockerId;
		private String label;
			
		public Locker() {
			// TODO Auto-generated constructor stub
		}

		public Locker(int lockerId, String label) {
			super();
			this.lockerId = lockerId;
			this.label = label;
		}

		public void lock() {
			System.out.println("locked " + accNo);
		}

		public void unloack() {
			System.out.println("unlocked " + ownerName);
		}

		public void keepThings() {
			System.out.println("this is all things which kept in locker " + balance);
		}
	} // end of the inner class
} // end of the outer class
