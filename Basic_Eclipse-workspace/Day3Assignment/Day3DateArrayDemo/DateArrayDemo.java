/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

package Day3DateArrayDemo;

//this is client code used to display Mydate
public class DateArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate dateArr[];
		dateArr = new MyDate[2];
		
		dateArr[0] = new MyDate(1,2,2021);
		
		dateArr[0].display();
	}

}
