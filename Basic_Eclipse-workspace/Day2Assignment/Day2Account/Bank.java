/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2Account;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//display interest rate
		System.out.println("InterestRate is : " + Account.getInterestRate() + "\n");

		
		//ob1 object of Account
		Account ob1 = new Account();
		
		//set value for account details
		ob1.setAccNo(102);
		ob1.setOwnerName("Deep");
		ob1.setBalance(2000.0);
		ob1.setDurationYears(3);
		
		// get value for account details
		ob1.getAccNo();
		ob1.getOwnerName();
		ob1.getBalance();
		ob1.getDurationYears();
		
		Account.setInterestRate(0.45f);
		
		
		ob1.printDetails();
		ob1.calculateInterest();
		
		//ob2 object of Account
		Account ob2 = new Account(203, "Sherathiya", 40000.0, 3);
		
		Account.setInterestRate(0.06f);
		ob2.printDetails();
		ob2.calculateInterest();
		
		ob1.countAccount();
	}

}
// end of the class
