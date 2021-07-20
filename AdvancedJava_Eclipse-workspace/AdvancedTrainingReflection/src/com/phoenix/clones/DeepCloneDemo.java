package com.phoenix.clones;

import com.phoenix.date.DateDemo;
import com.phoenix.models.Product;

public class DeepCloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(993, "laptop", "dell", 54000.00f, new DateDemo(04, 10, 2021));

		System.out.println("Original Product: " + product);

		// deep copying

		// get the clone of container object Product
		try {
			Product cloneProd = (Product) product.clone();
			System.out.println("CLone of product: " + cloneProd);

			DateDemo originalMfgDate = product.getMfgDate();

			// get the clone of container object Mfg date
			DateDemo clonedMfgDate = (DateDemo) originalMfgDate.clone();

			// deep copy
			cloneProd.setMfgDate(clonedMfgDate);

			cloneProd.getMfgDate().setDd(28);

			System.out.println("Original Product: " + product);
			System.out.println("Cloned product: " + cloneProd);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
