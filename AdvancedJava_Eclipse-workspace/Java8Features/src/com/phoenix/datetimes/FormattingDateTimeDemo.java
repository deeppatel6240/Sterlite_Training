package com.phoenix.datetimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// current date time
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Original" + dt);

		// full
		DateTimeFormatter formatter = DateTimeFormatter
										.ofLocalizedDate(FormatStyle.FULL);
		dt.format(formatter);
		String formattedDate = dt.format(formatter);

		System.out.println("Full: " + formattedDate);

		// long
		DateTimeFormatter formatter1 = DateTimeFormatter
										.ofLocalizedDate(FormatStyle.LONG);
		dt.format(formatter1);
		String formattedDate1 = dt.format(formatter1);

		System.out.println("Long: " + formattedDate1);
		
		// short
		DateTimeFormatter formatter2 = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.SHORT);
		dt.format(formatter2);
		String formattedDate2 = dt.format(formatter2);

		System.out.println("Short: " + formattedDate2);
		
		// medium
		DateTimeFormatter formatter3 = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.MEDIUM);
		dt.format(formatter3);
		String formattedDate3 = dt.format(formatter3);

		System.out.println("Medium: " + formattedDate3);
		
	}

}
