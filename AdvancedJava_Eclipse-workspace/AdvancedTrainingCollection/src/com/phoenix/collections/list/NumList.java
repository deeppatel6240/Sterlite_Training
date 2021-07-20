package com.phoenix.collections.list;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 14/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.phoenix.comparators.CompareNum;

public class NumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = new ArrayList<Integer>();

		numList.add(120);
		numList.add(150);
		numList.add(20);
		numList.add(50);
		numList.add(60);
		numList.add(50);
		numList.add(80);
		numList.add(10);
		/*
		 * another method of creating list with unsafe data type
		 * 
		 * List numList1 = new ArrayList();
		 * 
		 * numList1.add(20); 
		 * numList1.add("Hello");
		 */
		// iterating over the list 
		System.out.println("Using for loop:");
		
		for (int i = 0; i < numList.size(); i++) {
			int ele = numList.get(i);
			System.out.println(ele);
		}
		
		// using Iterator
		System.out.println("Using Iterator:");
		
		Iterator<Integer> it = numList.iterator();
		while (it.hasNext()) {
			int ele = it.next();
			System.out.println(ele);
		}
		
		// using forEach loop
		System.out.println("Using for Each loop:");
		for (int ele: numList) {
			System.out.println(ele);
		}
		
		// direct printing numList
		System.out.println("Direct print numList:");
		System.out.println(numList);
		
		// reverse list
		Collections.reverse(numList);
		
		//Using for each loop
		System.out.println("Reverse list using for each loop:");
		
		for (int ele: numList) {
			System.out.println(ele);
		}
		
		// sorting in ascending order
		Collections.sort(numList);
		
		// Using for each loop
		System.out.println("Reverse ascending list using for each loop:");

		for (int ele : numList) {
			System.out.println(ele);
		}
		
		Collections.sort(numList, new CompareNum());
		System.out.println("As per user define comparator: ");
		for (int ele: numList) {
			System.out.println(ele);
		}
		
		Comparator<Integer> c = Collections.reverseOrder();
		Collections.sort(numList, c);
		System.out.println("Using ReverseOrder() method in desc order");
		for (int ele: numList) {
			System.out.println(ele);
		}
		
		
		Collections.reverse(numList);
		System.out.println("In reverse order: ");
		for (int ele: numList) {
			System.out.println(ele);
		}
	}

} // end of the class
