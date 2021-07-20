/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

package Day2MyDateSG;

import Day2MyDateP.MyDateP;

public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object of MyDateP class (Default constructor)
		MyDateSG ob1 = new MyDateSG();
		
		//all setter method invoking using ob1 object
		ob1.setDay(1);
		ob1.setMonth(1);
		ob1.setYear(2021);
		
		//all getter method invoking using ob1 object
		ob1.getDay();
		ob1.getMonth();
		ob1.getYear();
		
		System.out.println("Using Default Constructor:");
		ob1.printDate();

		// object of MyDateP class (Parameterized constructor)
		MyDateSG ob2 = new MyDateSG(9, 6, 2021);
		

		// all getter method invoking using ob2 object
		ob2.getDay();
		ob2.getMonth();
		ob2.getYear();

		System.out.println("Using Parameterized Constructor:");
		ob2.printDate();
	}

}
//end of the class
