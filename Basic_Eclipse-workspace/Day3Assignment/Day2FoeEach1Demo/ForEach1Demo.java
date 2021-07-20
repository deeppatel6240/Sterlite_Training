/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

package Day2FoeEach1Demo;

//this is client code used to display 1d array
public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arr array using new keyword
		double arr[];
		
		arr = new double[5];
		
		arr[0] = 25.25;
		arr[1] = -28.2;
		arr[2] = 12;
		arr[3] = -67.9;
		arr[4] = 241.86;
		
		System.out.println("Array using For Each loop : ");
		for(double a:arr) {
			System.out.println(a);
		}
		
		// arr1 array without using new keyword
		float arr1[] = {56.121f, 2.32f, 134.45f, 134.643f, 43.212f, 12.8f, 89.8f, 92.91f };

		System.out.println("Array without using new keyword");

		for (float b:arr1){
			System.out.println(b);
		}

		// arr2 array using new keyword which present all string value inside array
		String arr2[];

		arr2 = new String[5];

		arr2[0] = "rose";
		arr2[1] = "sunflower";
		arr2[2] = "tulip";
		arr2[3] = "lotus";
		arr2[4] = "lily";

		System.out.println("Array element of string array");

		for (String c:arr2) {
			System.out.println(c);
		}

		// arr3 array without using new keyword
		String arr3[] = { "india", "USA", "Russia", "Uk", "Japan" };

		System.out.println("Array element of string array");

		for (String d: arr3) {
			System.out.println(d);
		}
	}

}

//end of the class
