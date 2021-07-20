package com.phoenix.interfaces.functional;

public class Message {
	
	private String msg;
	
	public Message() {
		System.out.println("Default");
	}

	public Message(String msg) {
		super();
		this.msg = msg;
		System.out.println("Parameterized");
	}
	
	public String getMsg() {
		return msg;
	}
	
}
