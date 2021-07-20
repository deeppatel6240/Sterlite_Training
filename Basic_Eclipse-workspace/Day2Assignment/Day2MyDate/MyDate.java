/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MyDate;

//This is my class representing date entity
public class MyDate {
	
	//data members
	private int day;
	private int month;
	private int year;
	
	
	//member methods
	//initDate() method is used to initialize date parts like day, month and year
	public void initDate() {
		day = 24;
		month = 10;
		year = 1999;
	}
	
	//printDate() method is used to print above variable as single date
	public void printDate() {
		System.out.println("Date is " + day + "-" + month + "-" + year);
	}

}
//End of the class