package com.phoenix.collections.searching;

import java.util.Arrays;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 19/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */
public class SerchArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 50, 20, 80, 40, 10, 90 };

		Arrays.sort(arr);
		
		System.out.println("Sorted Array");
		Arrays.stream(arr).forEach(System.out::println);;
		
		// if element is not in array then follow below formula
		/*
		 * check element which is come after which element.
		 * for example we have to check 30 which is not in our array.
		 * 30 comes after 20 so index would be 2 for inserting 30 in array 
		 * then 
		 * 	formula:---> - index no of n(30) - 1; 
		 * 
		 *  	answer is ---> - (2) - 1 = -3 ;
		 */
		int searchIdx = Arrays.binarySearch(arr, 30);
		System.out.println("Element is found at index number: " + searchIdx);
		
	}

}
