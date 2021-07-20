/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

package Day3ArrayDemo;

//this is client code used to display 1d array
public class ArrayDemo {

	//main method of class ArrayDemo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arr array using new keyword
		int arr[];
		
		arr = new int[6];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		
		System.out.println("All Elements in array are as follow");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//arr1 array without using new keyword
		int arr1[] = {56, 32, 45, 643, 212, 8, 9 ,92};
		
		System.out.println("Array without using new keyword");
		
		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j]);
		}
		
		//arr2 array using new keyword which present all string value inside array
		String arr2[];
		
		arr2 = new String[5];
		
		arr2[0] = "Junagadh";
		arr2[1] = "gandhinagar";
		arr2[2] = "rajkot";
		arr2[3] = "jamnagar";
		arr2[4] = "ahmedabad";
		
		System.out.println("Array element of string array");

		for (int k = 0; k < arr2.length; k++) {
			System.out.println(arr2[k]);
		}
		
		
		//arr3 array without using new keyword
		String arr3[] = {"cricket", "volleyball", "travelling", "reading", "video games"};
		
		System.out.println("Array element of string array");

		for (int l = 0; l < arr3.length; l++) {
			System.out.println(arr3[l]);
		}
	}

}
//end of the class
