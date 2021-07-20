package com.phoenix.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class NumDeckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deque<Integer> deq = new LinkedList<Integer>();
	
		Deque<Integer> deq = new ArrayDeque<Integer>();	
		
		deq.add(100);
		deq.add(200);
		deq.addFirst(300);
		deq.addFirst(350);
		deq.addLast(50);
		
		System.out.println("Front of deq: " + deq.peek());
		System.out.println("First element of deq: " + deq.peekFirst());
		System.out.println("First element of deq: " + deq.peekLast());
		
		System.out.println("polling element: " + deq.poll());
		System.out.println("Polling first element: " + deq.pollFirst());
		System.out.println("Polling last element: " + deq.pollLast());
	}

}
