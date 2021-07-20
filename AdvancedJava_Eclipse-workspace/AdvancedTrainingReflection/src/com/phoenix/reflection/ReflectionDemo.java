package com.phoenix.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.phoenix.models.Product;

public class ReflectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Class c = Class.forName("com.phoenix.models.Product");
			Class c = Class.forName("com.phoenix.models.ElectronicProd");

			System.out.println("class is loaded\n");

			// creating an object using reflection
			/*
			 * Product p = (Product) c.newInstance();
			 * System.out.println("Object of product is created using reflection");
			 * 
			 * p.setId(10562); p.setBrand("laptop"); p.setName("hp"); p.setPrice(12345.87f);
			 * 
			 * System.out.println(p);
			 */

			Field fArr[] = c.getFields();

			for (Field f : fArr) {
				// System.out.println(f.getName());
				System.out.println(f);
			}
			
			System.out.println();

			Method mArr[] = c.getMethods();
			for (Method m : mArr) {
				System.out.println(m.getName());
				//System.out.println(m);
			}
			
			System.out.println();
			
			Method mArr1[] = c.getDeclaredMethods();

			for (Method m : mArr1) {
				//System.out.println(m.getName());
				System.out.println(m);
			}
			
			System.out.println();
			
			Constructor cArr[] = c.getConstructors();
			
			for (Constructor m : cArr) {
				//System.out.println(m.getName());
				System.out.println(m);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
