package com.phoenix.properties;

import java.util.Properties;

public class PropsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		
		props.setProperty("Username", "Deep");
		props.setProperty("Password", "Deep1234");
		
		String uname = props.getProperty("Username");
		String pass = props.getProperty("Password", "admin123");
		
		System.out.println(uname);
		System.out.println(pass);
	}

}
