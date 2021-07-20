package com.phoenix.enums;

public enum WeekDay {
	MONDAY(123), TURESDAY, WEDNESDAY(214, "wed"), THURSDAY(20, "thur"), FRIDAY, SATURDAY(231, "sat"), SUNDAY;
	
	private int dayNo;
	private static int count; // you can declare static variable in enum
	private String shortName;
	
	// must be private constructor
	private WeekDay() {
		dayNo = 1;
		System.out.println("No Arg Constructor is called");
	}
	 
	WeekDay(int dayNo){
		this.dayNo = dayNo;
		System.out.println("Single Parameterized Constructor is called");
	}
	
	WeekDay(int dayNo, String ShortName){
		this.dayNo = dayNo;
		this.shortName = ShortName;
		System.out.println("Two Parameterized Constructor is called");
	}
	
	public int getDayNo() {
		return dayNo;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	//public static WeekDay getNewDay() {
		
		//Cannot instantiate the type WeekDay
		//WeekDay oneMoreDay = new WeekDay();
		// return oneMoreDay;
	//}
}
