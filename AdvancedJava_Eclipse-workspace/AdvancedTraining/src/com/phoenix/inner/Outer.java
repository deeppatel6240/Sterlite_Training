package com.phoenix.inner;

public class Outer {

	private int i;

	public void outer() {
		i = 200;
	}

	public void display() {
		System.out.println("i is: " + i);
	}

	// static inner class
	public static class Inner {
		private int j;
		private static int c;

		public Inner() {
			// TODO Auto-generated constructor stub
			j = 100;
			c = 200;
		}

		public Inner(int j, int c) {
			super();
			this.j = j;
			this.c = c;
		}
		
		public void show() {
			System.out.println("value of j is: " + j);
		}
		
		public static void test() {
			System.out.println("value of c is: " + c);
		}
	} // end of inner class
} // end of outer class 
