/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MyDateC;

//This is my class representing date entity
public class MyDateC {
	
	// private data members
	private int day;
	private int month;
	private int year;
	
	// default constructor
	MyDateC(){
		day = 12;
		month = 12;
		year = 2021;
	}
	
	// member method
	public void printDate() {
		System.out.println("My date is :");
		System.out.println(day + "/" + month + "/" + year);
	}
}
//end of the class
