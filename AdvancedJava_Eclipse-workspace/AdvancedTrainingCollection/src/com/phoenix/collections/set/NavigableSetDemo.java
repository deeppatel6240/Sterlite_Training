package com.phoenix.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Double> set = new TreeSet<Double>();
		
		set.add(2.23);
		set.add(3.23);
		set.add(4.23);
		set.add(5.23);
		set.add(6.23);
		set.add(342.23);
		set.add(212.23);
		set.add(452.23);
		
		System.out.println("set in ascending order: " + set);
		
		for (double ele: set) {
			System.out.println(ele);
		}
		
		System.out.println("celling is: " + set.ceiling(342.23));
		
		System.out.println("celling is: " + set.ceiling(442.23));
		
		System.out.println("celling is: " + set.ceiling(642.23));
		
		System.out.println("floor is: " + set.floor(5.23));
		
		System.out.println("floor is: " + set.floor(452.23));
		
		System.out.println("floor is: " + set.floor(5.3));
		
		System.out.println("floor is: " + set.floor(2.0));
		
		System.out.println("higher is: " + set.higher(5.23));
	
		System.out.println("higher is: " + set.higher(452.23));	
		
		System.out.println("lower is: " + set.lower(5.23));
		
		System.out.println("lower is: " + set.lower(452.23));
		
		System.out.println("lower is: " + set.lower(5.13));
	}

}
