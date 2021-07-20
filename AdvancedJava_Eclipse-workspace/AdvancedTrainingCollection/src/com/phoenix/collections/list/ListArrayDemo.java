package com.phoenix.collections.list;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays to list conversation
		List<Integer> numList = Arrays.asList(100,120,120,3043,23,12,34);
		
		System.out.println(numList);
		
		numList.forEach(System.out::println);
		
		//numList.add(120); ----< java.lang.UnsupportedOperationException
		//numList.remove(100); ----< java.lang.UnsupportedOperationException
		
		numList.set(2, 140); // replacement allowed because it does not change size of array
		
		// List to Array conversation
		Integer [] iArr = new Integer[numList.size()];
		
		iArr = numList.toArray(iArr);
		
		System.out.println("Using for each loop");
		
		for (int arr: iArr) 
			System.out.println(arr);
	}

}
