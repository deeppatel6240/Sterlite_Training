package com.phoenix.stacks;

import java.util.Stack;

public class NumStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> numst = new Stack<Integer>();
		
		numst.push(10);
		numst.push(60);
		numst.push(40);
		numst.push(20);
		numst.push(80);
		numst.push(90);
		numst.push(150);
		
		System.out.println("Top of numstack: " + numst.peek());
		
		int idx = numst.search(10);
		System.out.println("Element 80 is found at index number: " + idx);
		
		System.out.println("Pop the top element: " + numst.pop());
		
		while(!numst.isEmpty()) {
			System.out.println("pop the top: " + numst.pop());
		}
	}

}
