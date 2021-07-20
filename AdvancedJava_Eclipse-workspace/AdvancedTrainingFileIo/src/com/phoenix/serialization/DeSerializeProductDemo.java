package com.phoenix.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.phoenix.models.Product;

public class DeSerializeProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ObjectInputStream out = 
				new ObjectInputStream(new FileInputStream("productData.txt"));) {
			
			// create an object to be serialized
			//Product product = new Product(134, "Mobile", "Apple", 145000.00f);
			Product p = (Product) out.readObject();
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

} // end of the class
