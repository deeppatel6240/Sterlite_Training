/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MyDateP;

//This is my class representing date entity
public class MyDateP {
	
	//data members
	private int day;
	private int month;
	private int year;
	
	
	//default constructor
	MyDateP(){
		day = 24;
		month = 10;
		year = 1999;
	}
	
	//parameterized constructor
	MyDateP(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}

	//printDate() method is used to print above variable as single date
	public void printDate() {
		System.out.println("Date is " + day + "-" + month + "-" + year);
	}
}
//end of the class
