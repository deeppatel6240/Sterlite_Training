package com.phoenix.collections.set;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 14/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */
import java.util.Collections;
/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 14/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.phoenix.comparators.CompareNum;

public class NumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// unordered and unsorted
		// Set<Integer> numSet = new HashSet<Integer>();

		// ordered and unsorted
		// Set<Integer> numSet = new LinkedHashSet<Integer>();

		// ordered and sorted
		// Set<Integer> numSet = new TreeSet<Integer>();

		// ordered and sorted
		// Set<Integer> numSet = new TreeSet<Integer>(new CompareNum());

		// ordered and sorted
		Set<Integer> numSet = new TreeSet<Integer>(Collections.reverseOrder());

		numSet.add(120);
		numSet.add(150);
		numSet.add(20);
		numSet.add(50);
		numSet.add(60);
		numSet.add(50);
		numSet.add(80);
		numSet.add(10);

		// using Iterator
		System.out.println("Using Iterator:");

		Iterator<Integer> it = numSet.iterator();
		while (it.hasNext()) {
			int ele = it.next();
			System.out.println(ele);
		}

		// using forEach loop
		System.out.println("Using for Each loop:");
		for (int ele : numSet) {
			System.out.println(ele);
		}

		// direct printing numList
		System.out.println("Direct print numSet:");
		System.out.println(numSet);

		// checking set is null or not
		System.out.println("Checking that aSet is Null or Not:");
		boolean b = numSet.isEmpty();
		System.out.println(b);

	}

}
