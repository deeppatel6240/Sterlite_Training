/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

package Day3VarArgDemo;

//this is client code used to display avg of variable arguments
public class VarArgDemo {

	//member function
	static double average(int...var) {
		int sum = 0;
		double avg;
		
		int len = var.length;
	
		for(int i : var) {
			sum += i;
		}
		avg = sum / len;
		
		return avg;
	}
	
	//main method of VarArgDemo class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Average of all values is : " + average(10, 20, 30, 40, 50));
		
		System.out.println("Average of all values is : " + average(10, 20, 30, 40));
		
		System.out.println("Average of all values is : " + average(10, 20, 30));
	}

}
//end of the class
