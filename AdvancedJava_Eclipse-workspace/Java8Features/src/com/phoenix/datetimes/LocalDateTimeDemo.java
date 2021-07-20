package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// local date
		
		// current date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// any date
		LocalDate date1 = LocalDate.of(1999, 10, 24);
		System.out.println(date1);
		
		// local time
		
		// current time
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		// any time
		LocalTime ltAny = LocalTime.of(12, 30);
		System.out.println(ltAny);
		
		// local date time
		
		// current date time
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		// any date time
		LocalDateTime dtAny = LocalDateTime.of(date1, ltAny);
		System.out.println(dtAny);
		
		// Zoned Date time
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		// checking default zone of Computer System
		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println(defaultZone);
		
		Set<String> getZoneId = ZoneId.getAvailableZoneIds();
		//getZoneId.stream().sorted().forEach(System.out::println);
		getZoneId.stream()
				 .sorted()
				 .filter(z -> z.startsWith("I") || z.startsWith("A"))
				 .forEach(System.out::println);
		
		ZoneId zone = ZoneId.of("Pacific/Rarotonga");
		ZonedDateTime zdt1 = ZonedDateTime.of(dtAny, zone);
		System.out.println(zdt1);
		
	}

}
