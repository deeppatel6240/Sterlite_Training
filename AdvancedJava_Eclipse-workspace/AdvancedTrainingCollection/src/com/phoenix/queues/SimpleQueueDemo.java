package com.phoenix.queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// FIFO or LILO
		//Queue<Integer> numQ = new LinkedList<Integer>();
		
		//Queue<Integer> numQ = new PriorityQueue<Integer>();

		Queue<Integer> numQ = new PriorityQueue<Integer>(Collections.reverseOrder());;
		
		numQ.add(100);
		numQ.offer(30);
		numQ.add(200);
		numQ.offer(50);
		numQ.add(400);
		numQ.offer(70);
		numQ.add(100);
		numQ.offer(30);

		System.out.println("Head of numQ: " + numQ.peek());

		System.out.println("Removing head: " + numQ.poll());

		System.out.println("Head of numQ after removing: " + numQ.peek());

		while (!numQ.isEmpty()) {
			System.out.println("Polling element: " + numQ.poll());
		}

		System.out.println("Head of numQ: " + numQ.peek());

		//System.out.println("Head of numQ: " + numQ.element());
		
		System.out.println("Head of numQ: " + numQ.poll());
		
		//System.out.println("Head of numQ: " + numQ.remove());
	}
}
