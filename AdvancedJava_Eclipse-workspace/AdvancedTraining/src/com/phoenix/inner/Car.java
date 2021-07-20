package com.phoenix.inner;

// outer class
public class Car {
	
	public void show() {
		ferrari.test();
	}
	
	// anonymous inner class which is sub class of (Ferrari class)
	Ferrari ferrari = new Ferrari() {
		
		private String model;
		
		// instance initialization block
		{
			model = "Ferrari Sports";
		}
		
		// special type of method
		public void showModel() {
			System.out.println(model);
		}
		
		// overriding method
		public void test() {
			
			// calling special method
			showModel();
			System.out.println("Anonymous class overloading method: " + model);
		}
	}; // end of the inner class
} // end of the outer class
