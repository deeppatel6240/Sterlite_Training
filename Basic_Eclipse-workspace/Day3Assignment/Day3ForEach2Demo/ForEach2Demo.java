/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

package Day3ForEach2Demo;

//this is client code used to display 1d array
public class ForEach2Demo {
	
	//main method of class ForEach2Demo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arr2D array using new keyword
		int arr2D[][];
		arr2D = new int[4][3];

		arr2D[0][0] = 121;
		arr2D[0][1] = 222;
		arr2D[0][2] = 642;

		arr2D[1][0] = 332;
		arr2D[1][1] = 6445;
		arr2D[1][2] = 12423;

		arr2D[2][0] = 9842;
		arr2D[2][1] = 752;
		arr2D[2][2] = 192;
		
		arr2D[3][0] = 1234;
		arr2D[3][1] = 2;
		arr2D[3][2] = 435;

		System.out.println("This is my 2d Array :");
		
		for (int a[] : arr2D) {
			for (int x : a) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		
		//sArr2D array without using new keyword
		int sArr2D[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } };

		System.out.println("This is my second 2d Array :");
		
		for (int a[] : sArr2D) {
			for (int x : a) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		
	}

}
