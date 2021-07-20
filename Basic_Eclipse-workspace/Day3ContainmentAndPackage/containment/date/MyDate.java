/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */
package containment.date;

//MyDate class of containment.date package
public class MyDate {
	
	//private data members
	private int day;
	private int month;
	private int year;
	
	
	// public default constructor of class 
	public MyDate() {
		day = 24;
		month = 10;
		year = 1999;
	}
	
	//parameterized constructor of class
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//get method of day
	public int getDay() {
		return day;
	}

	//set method of day
	public void setDay(int day) {
		this.day = day;
	}

	//get method of month
	public int getMonth() {
		return month;
	}

	//set method of month
	public void setMonth(int month) {
		this.month = month;
	}

	//get method of year
	public int getYear() {
		return year;
	}

	//set method of year
	public void setYear(int year) {
		this.year = year;
	}

	//member method
	public void printDate() {
		System.out.println("Date is  :" + day + "/" + month + "/" + year);
	}
	
	//second member method 
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	
}
//end of the class
