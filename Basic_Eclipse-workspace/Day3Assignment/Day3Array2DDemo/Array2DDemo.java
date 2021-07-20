/*
 * Author: deepkumar.sherathiya@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1
 * Copyright: Sterlite Technologies Ltd.
 */

package Day3Array2DDemo;

//this is client code used to display 1d array
public class Array2DDemo {
	
	//main method of class Array2DDemo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arr2D array using new keyword
		int arr2D[][];
		arr2D = new int[3][3];
		
		arr2D[0][0] = 12;
		arr2D[0][1] = 22;
		arr2D[0][2] = 62;
		
		arr2D[1][0] = 32;
		arr2D[1][1] = 645;
		arr2D[1][2] = 1223;
		
		arr2D[2][0] = 982;
		arr2D[2][1] = 72;
		arr2D[2][2] = 92;
		
		System.out.println("This is my 2d Array :");
		
		for(int i = 0; i < arr2D.length; i++) {
			for(int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j] + "\t");
			}
			System.out.println();
		}
		
		//sArr2D array without using new keyword
		int sArr2D[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}};
		
		System.out.println("This is my second 2d Array :");
		
		for(int i = 0; i < sArr2D.length; i++) {
			for(int j = 0; j < sArr2D[i].length; j++) {
				System.out.print(sArr2D[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}

// end of the class
