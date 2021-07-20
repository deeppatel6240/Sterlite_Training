package com.phoenix.wrapper.main;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;

		Integer i1 = Integer.valueOf(a); // wrapping
		System.out.println("wrapping: " + i1);

		int c = i1.intValue(); // unwrapping
		System.out.println("unwrapping: " + c);

		String s = "2000";

		Integer i2 = Integer.parseInt(s);
		System.out.println(i2);

		Boolean b1 = Boolean.valueOf("True");
		Boolean b2 = Boolean.valueOf("rrgagr");
		Boolean b3 = Boolean.valueOf(true);
		Boolean b4 = Boolean.valueOf(null);
		Boolean b5 = Boolean.valueOf("null");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

		int m = Integer.max(20, 2000);
		System.out.println("Max value:" + m);

		// question to be noted true or false
		/*
		 * Integer i13 = 100; 
		 * Float f2 = 100.0f; 
		 * if (i13 == f2)
		 * 		System.out.println("true"); 
		 * else 
		 * 		System.out.println("false");
		 * 
		 * 
		 * answer --> compilation error in line no 38
		 * 			  because we can't compare diff reference of diff wrapper class  
		 */

		// question to be noted true or false
		Integer i12 = 100;
		Float f1 = 100.0f;
		if (i12 >= f1)
			System.out.println("true");
		else
			System.out.println("false");
		
		// question to be noted true or false
		Integer i13 = 100;
		float f2 = 100.0f;
		if (i13 >= f2)
			System.out.println("true");
		else
			System.out.println("false");
		
		// question to be noted true or false
		Integer i14 = 100;
		float f3 = 100.0f;
		
		// if (100 == 100.0f) here checking value
		if (i14 == f3)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
