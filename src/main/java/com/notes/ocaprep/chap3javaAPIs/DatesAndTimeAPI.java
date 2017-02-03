/**
 * 
 */
package com.notes.ocaprep.chap3javaAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * @author Hareesha
 * Feb 2, 2017 2017
 */
public class DatesAndTimeAPI {

	/**
		1. Date And Time API:
			
			1. LocalDate : Contains just date , NO time or NO time zone
			
			2. LocalTime : contains just time
			
			3. LocalDateTime : contains both Date and Time
			
		2. All these 3 classes have a static method, to find the current date, time and dateTie
			
			LocalDate.now()
			LocalTime.now()
			LocalDateTime.now()
			
		3. Creating a date : of() is the static method of LocalDate,LocalTime,LocalDateTime
		
			LocalDate d1 = LocalDate.of(2015,Month.JANUARY,20);
			LocalTime t1 = LocalTime.of(6,30,30,123);//hr,min.sec,nanosec
			
			LocalDateTime dt = LocalDateTime.of(2015,Month.FEBRUARY,20,6,15,20);
			LocalDateTime dt2 = LocalDateTime.of(d1,t1);
			
		4. new instances of LocalDate , LocalTime and LocalDateTime DO NOT COMPILE.
		
		5. LocalDate.of(2015,1,32);EXCEPTION - DateTimeException.
		
		6. Months counting starting with 1 other than 0.
		
		7. LocalDates,LocalTime and LocalDateTime are immutables , so lus methods have return values ignored unless they are
			captured.Like String objects
		
	Period class :All ofXXX methods are static methods of Period class
	
		1. Period.ofYears(1)//every 1 year
		   Period.ofMonths(1)//every 1 month
		   Period.ofWeeks(3)//every 3 week
		   Period.ofDays(2) // every 2 days
		   Period.of(1,0,7) //every year and 7 days
		   
	What Period object can be used :
		
		1. d1.plus(Period.ofYears(1));
		   dt.plus(period)
		   t1.plus(period) // UnsupportedTemporalTypeException
		   
		   Same for minus()
		   
		2. 	d1.plusDays(1);
			d1.plusWeeks(1);
			d1.plusMonths(2);
			d1.plusYears(2);
			
			same for minus()
			
		3. Period doesn't allow chaining, So even if it is chained only last method call counts
		
		Period p = Period.ofDays(1).ofYears(1);
		
		Here in this case only last perios operation counts.
		
		4. DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		   DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate();
		    									   ofLocalizedTime()
		
	 */
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		//LocalTime t1 = new LocalTime(); 
		
		LocalDateTime dt = LocalDateTime.of(2015,12,1,2,23,20,250);
		
		LocalDate date = LocalDate.of(2015, 11, 11);
		System.out.println("Date before applying period"+date);
		Period p = Period.ofYears(1);
	
		
		System.out.println("Date after applied Period"+	date.plus(p));
		
		System.out.println("Date after applied Period"+	date.plusDays(2));
		
		d1.plusDays(1);
		d1.plusWeeks(1);
		d1.plusMonths(2);
		d1.plusYears(2);
		
	
	}

}
