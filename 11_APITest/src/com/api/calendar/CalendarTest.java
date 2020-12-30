package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		CalendarTest ct = new CalendarTest();
		ct.test1();

	}
	
	public void test1() {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, 2011);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DATE, 21);
		char[] dayOfWeek = { '일', '월', '화', '수', '목', '금', '토' };
		cal.set(Calendar.DAY_OF_WEEK, 1);
		cal.set(Calendar.HOUR, 3);
		cal.set(Calendar.MINUTE, 20);
		cal.set(Calendar.SECOND, 5);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		char dow = dayOfWeek[(cal.get(Calendar.DAY_OF_WEEK))];
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %c요일 %d시 %d분 %d초", year, month, day, dow, hour, min, second);
		
		
		
	}
}
