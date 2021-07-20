/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MyDateSG;

//This is my class representing date entity
public class MyDateSG {
	//data members
	private int day;
	private int month;
	private int year;
		
		
	//default constructor
	MyDateSG(){
		day = 24;
		month = 10;
		year = 1999;
		}
		
	//parameterized constructor
	MyDateSG(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
		}
	
	//get method for day
	public int getDay() {
		return this.day;
	}

	//set method for day
	public void setDay(int day) {
		this.day = day;
	}
	
	//get method for month
	public int getMonth() {
		return this.month;
	}
	
	//set method for month
	public void setMonth(int month) {
		this.month = month;
	}

	//get method for year
	public int getYear() {
		return this.year;
	}

	//set method for year
	public void setYear(int year) {
		this.year = year;
	}

	//printDate() method is used to print above variable as single date
	public void printDate() {
		System.out.println("Date is " + day + "-" + month + "-" + year);
	}
}
// end of the class
