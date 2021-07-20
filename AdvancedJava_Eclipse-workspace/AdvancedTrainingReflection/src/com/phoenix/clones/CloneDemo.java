package com.phoenix.clones;

import com.phoenix.date.DateDemo;
import com.phoenix.models.Product;

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(993, "laptop", "dell", 54000.00f, new DateDemo(04, 10, 2021));
		
		System.out.println("Original Product: " + product);
		
		try {
			// shallow copy
			Product cloneProd = (Product) product.clone();
			System.out.println("Cloned product: " + cloneProd);
			
			cloneProd.getMfgDate().setDd(28);
			
			System.out.println("Original Product: " + product);
			System.out.println("Cloned product: " + cloneProd);
			
			/*
			 * if (cloneProd == product) { System.out.println("Single object"); } else {
			 * System.out.println("Different objects"); }
			 * 
			 * Product cloneCloneProd = (Product) cloneProd.clone();
			 * System.out.println("clone Cloned product: " + cloneCloneProd);
			 */
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
