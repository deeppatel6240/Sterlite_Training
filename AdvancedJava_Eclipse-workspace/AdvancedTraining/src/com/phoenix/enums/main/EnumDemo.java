package com.phoenix.enums.main;

import com.phoenix.enums.Color;
import com.phoenix.enums.WeekDay;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Color.BLACK);

		Color favColor = Color.GRREEN;
		System.out.println(favColor);

		System.out.println("Ordinal is : " + Color.PINK.ordinal());

		for (Color c : Color.values()) {
			System.out.println(c);
		}

		System.out.println();

		// System.out.println(WeekDay.FRIDAY);

		System.out.println("Ordinal: " + WeekDay.THURSDAY.ordinal());
		System.out.println("Day no:: " + WeekDay.THURSDAY.getDayNo());
		System.out.println("Short name: " + WeekDay.THURSDAY.getShortName());

		// System.out.println(WeekDay.MONDAY);

		/*
		 * WeekDay whichDay = WeekDay.SUNDAY;
		 * 
		 * switch (whichDay) { case MONDAY: System.out.println("it is monday"); break;
		 * 
		 * case TURESDAY: System.out.println("it is tuesday"); break;
		 * 
		 * case WEDNESDAY: System.out.println("it is wednesday"); break;
		 * 
		 * case THURSDAY: System.out.println("it is thursday"); break;
		 * 
		 * case FRIDAY: System.out.println("it is friday"); break;
		 * 
		 * case SATURDAY: System.out.println("it is saturday"); break;
		 * 
		 * case SUNDAY: System.out.println("it is sunday"); break;
		 * 
		 * default: break; }
		 */

	}

}
