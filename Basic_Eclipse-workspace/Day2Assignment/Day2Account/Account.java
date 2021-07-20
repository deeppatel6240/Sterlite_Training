/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2Account;

//this is class account which contain all the member method and data members
public class Account {
	
	//data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	//private static data member
	private static float interestRate;
	private static int count;
	
	static {
		interestRate = 0.05f;
	}
	
	//default constructor
	Account(){
		
		System.out.println("This is my Default Constructor \n");
		
		count++;
		accNo = 101;
		ownerName = "Bhargav";
		balance = 50000;
		durationYears = 3;
	}
	
	//parameterized constructor
	Account(int accNo, String ownerName, double balance, float years){
		System.out.println("This is my parameterized constructor \n");
		count++;
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYears = years;
	}
	
	//get method of accNo
	public int getAccNo() {
		return this.accNo;
	}

	//set method of accNo
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	//get method of ownerName
	public String getOwnerName() {
		return this.ownerName;
	}
	
	//set method of owner method
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	//get method of balance
	public double getBalance() {
		return this.balance;
	}

	//set method of balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//get method of durationYears
	public float getDurationYears() {
		return this.durationYears;
	}

	//set method of durationYears
	public void setDurationYears(float durationYears) {
		this.durationYears = durationYears;
	}

	//get method of interestRate
	public static float getInterestRate() {
		return interestRate;
	}

	//set method of interestRate
	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}

	//get method of no of account count
	public static int getCount() {
		return count;
	}
	

	// member method named printDetails which display all banks details
	public void printDetails() {
		System.out.println("Bank Details is ");
		System.out.println();
		System.out.println("Account Number : " + accNo + "\n" +
							"Owner Name : " + ownerName + "\n" +
							"Balance is : " + balance + "\n" + 
							"Interestrate is : " + interestRate + "\n" +
							"Duration of year is : " + durationYears + "\n");
	}
	
	//member method named calculateInterest which display interest
	public void calculateInterest() {
		double interestAmount = balance * interestRate * durationYears;
		System.out.println("Amount is : "+ interestAmount + "\n");
	}
	
	//member method named noofAccount which display no of account 
	public static void countAccount() {
		System.out.println("Account present in Bank : " + count);
	}
	
}
//end of the class





