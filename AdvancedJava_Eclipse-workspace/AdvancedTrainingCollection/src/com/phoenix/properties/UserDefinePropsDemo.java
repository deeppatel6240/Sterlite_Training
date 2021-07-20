package com.phoenix.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserDefinePropsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream in = new FileInputStream("credentials.properties");) {
			
			Properties props = new Properties();
			props.load(in);
			
			String uname = props.getProperty("Username");
			String pwd = props.getProperty("Password");
			
			System.out.println(uname);
			System.out.println(pwd);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
