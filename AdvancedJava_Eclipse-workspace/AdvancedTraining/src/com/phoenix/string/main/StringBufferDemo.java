package com.phoenix.string.main;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// by default capacity is 16
		StringBuffer sb = new StringBuffer();

		System.out.println("Capacity: " + sb.capacity());
		System.out.println("Size: " + sb.length());

		sb.append("Hello");

		System.out.println("Capacity: " + sb.capacity());
		System.out.println("Size: " + sb.length());

		// Ensures that the capacity is at least equal to the specified minimum. If the
		// current capacity is less than the argument, then a new internal array is
		// allocated with greater capacity. The new capacity is the larger of:
		// 1.The minimumCapacity argument.
		// 2.Twice the old capacity, plus 2.
		sb.append("This is StringBufferDemo");

		System.out.println("Capacity: " + sb.capacity());
		System.out.println("Size: " + sb.length());

		sb.reverse();
		
		System.out.println("Capacity: " + sb.capacity());
		System.out.println("Size: " + sb.length());
		System.out.println(sb);
		
		System.out.println();
		
		String s = sb.reverse().toString();
		System.out.println(s);
		
		System.out.println();
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println();
		
		// insert operation
		sb.insert(12, " deep ");
		System.out.println(sb);
		
		// replace operation
		sb.replace(4, 8, "XXXX");
		System.out.println(sb);
		
		
		System.out.println();
		
		// capacity will increased
		StringBuffer sb1 = new StringBuffer("Hello");

		System.out.println("Capacity: " + sb1.capacity());
		System.out.println("Size: " + sb1.length());
	}

} // end of the class
