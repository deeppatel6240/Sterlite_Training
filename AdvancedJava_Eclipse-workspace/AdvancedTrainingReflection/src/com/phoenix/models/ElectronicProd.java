package com.phoenix.models;

public class ElectronicProd extends Product{

	public int id;
	private String name;
	public float div;
	
	public void run() {
		
	}
	
	public String name() {
		return name;
	}
	
	public ElectronicProd() {
		
	}

	public ElectronicProd(int id, String name, float div) {
		super();
		this.id = id;
		this.name = name;
		this.div = div;
	}
	
	

}
