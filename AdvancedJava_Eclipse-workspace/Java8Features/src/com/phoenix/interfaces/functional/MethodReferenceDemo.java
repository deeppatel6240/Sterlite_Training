package com.phoenix.interfaces.functional;

/*
 * Creator Name: deepkumar.sherathiya@stltech.in
 * Date: 14/07/2021
 * Version: 1.0
 * Copyright: Sterlite Tech Ltd.
 */
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static method reference
		Movable m = MyClass::dMethod;
		m.move();
		
		//instance method reference on specific object
		MyClassSec mc = new MyClassSec();
		
		m = mc::sMethod;
		m.move();
		
		// instance method reference on arbitrary object
		StringMerger sm = String::concat;
		
		System.out.println(sm.merge("Deep", " Patel"));
		
		// Constructor reference
		Messaging ob1 = Message:: new;
		Message msg = ob1.getObject("deep");
		System.out.println(msg.getMsg());
		
		
	}

}
