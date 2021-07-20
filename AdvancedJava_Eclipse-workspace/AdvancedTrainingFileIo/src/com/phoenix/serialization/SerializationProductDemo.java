package com.phoenix.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.phoenix.models.Product;

public class SerializationProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream("productData.txt"));) {
			
			// create an object to be serialized
			Product product = new Product(134, "Mobile", "Apple", 145000.00f);
			
			out.writeObject(product);
			System.out.println("Product object is serialized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
