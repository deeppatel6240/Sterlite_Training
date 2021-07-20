/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MyDateT;

public class MyDateT {
	
	//data members
	private int day;
	private int month;
	private int year;

	//default constructor
	MyDateT(){
		/*
		 * day = 24; month = 10; year = 1999;
		 */
		this(1, 2, 2001);
	}
	
	//parameterized constructor
	MyDateT(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	//printDate() method is used to print above variable as single date
	public void printDate() {
		System.out.println("Date is " + day + "-" + month + "-" + year);
	}
}

//end of the class