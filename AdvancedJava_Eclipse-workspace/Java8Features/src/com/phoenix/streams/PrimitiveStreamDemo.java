package com.phoenix.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream ins = IntStream.of(20, 30,340, 23, 42);
		ins.forEach(System.out::println);
		
		//System.out.println();
		IntStream ins2 = IntStream.of(20, 30,340, 23, 42);
		ins2.sorted().forEach(System.out::println);
		
		IntStream ins1 = IntStream.iterate(1,  i -> i+1);
		ins1.limit(200).forEach(System.out::println);
		
		IntStream ins3 = IntStream.iterate(1,  i -> i+1);
		ins3.limit(200).skip(10).forEach(System.out::println);
	
		IntStream ins4 = IntStream.iterate(1,  i -> i+2);
		ins4.limit(20).skip(10).forEach(System.out::println);
		
		System.out.println("Stream of long type numbers");
		LongStream ls = LongStream.range(100L, 200L);
		ls.forEach(System.out::println);
		
		System.out.println("Stream of long type numbers (inclusive of upper limit)");
		LongStream ls1 = LongStream.rangeClosed(100L, 200L);
		ls1.forEach(System.out::println);
	}

}
