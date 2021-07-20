package com.phoenix.stacks;

import java.util.ArrayDeque;

public class NumstArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> arrDeq = new ArrayDeque<Integer>();
		
		arrDeq.addLast(150);
		arrDeq.addLast(160);
		arrDeq.addLast(250);
		arrDeq.addLast(750);
		arrDeq.addLast(550);
		arrDeq.addLast(570);
		arrDeq.addLast(670);
		
		
		System.out.println("Top of stack: " + arrDeq.peekLast());
		System.out.println("Pop the Top: " + arrDeq.pollLast());
		
		System.out.println("Top of stack: " + arrDeq.peekLast());
		
		while(!arrDeq.isEmpty()) {
			System.out.println("Pop the top: " + arrDeq.pollLast());
		}
	}

}
