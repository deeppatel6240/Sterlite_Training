/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */


package Day2MyDateT;

import Day2MyDateP.MyDateP;

public class DateMainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object of MyDateT class (Default constructor)
		MyDateT ob1 = new MyDateT();
			
		// object of MyDateP class (Parameterized constructor)
		MyDateT ob2 = new MyDateT(9, 6, 2021);
		
		//invoking member method by using ob1 object
		ob1.printDate();

		//invoking member method by using ob2 object
		ob2.printDate();
	}

}
//end of the class
