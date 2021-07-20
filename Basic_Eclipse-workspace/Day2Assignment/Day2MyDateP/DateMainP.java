/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MyDateP;

//This is my class representing date entity
public class DateMainP {

	//main method of DateMainP class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object of MyDateP class (Default constructor)
		MyDateP ob1 = new MyDateP();
		
		// object of MyDateP class (Parameterized constructor)
		MyDateP ob2 = new MyDateP(9, 6, 2021);
		
		//invoking member method by using ob1 object
		ob1.printDate();

		//invoking member method by using ob2 object
		ob2.printDate();
	}

}
//end of the class