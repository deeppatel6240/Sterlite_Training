package com.phoenix.interfaces.functional;

public interface A {
	default void test() {
		System.out.println("A");
	}
}
