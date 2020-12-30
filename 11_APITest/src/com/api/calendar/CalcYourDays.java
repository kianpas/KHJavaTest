package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalcYourDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 입력 : ");
		int year = sc.nextInt();
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		System.out.print("일 입력 : ");
		int day = sc.nextInt();
		
		Calendar birth = Calendar.getInstance();
		birth.set(year, month-1, day);
				
		Calendar now = Calendar.getInstance();
				
		long num1 = birth.getTimeInMillis();
		long num2 = now.getTimeInMillis();
				
		long diff = (num2 - num1) / 1000 / 60 / 60 / 24;
		
		System.out.println("태어난지 " + diff + "일입니다.");
		
	}

}
