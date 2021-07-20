package com.phoenix.inner.main;

import com.phoenix.inner.Outer;

public class StaticNestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner in = new Outer.Inner();
		in.show();
		in.test();
	}

}
