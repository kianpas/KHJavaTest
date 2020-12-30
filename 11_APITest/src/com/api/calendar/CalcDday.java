package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {
		
		CalcDday cd = new CalcDday();
		//cd.test1();
		cd.test2();

	}

	public void test1() {
		
		Calendar end = Calendar.getInstance();
		end.set(2021, Calendar.JULY, 8);
				
		Calendar now = Calendar.getInstance();
		
		long num1 = end.getTimeInMillis();
		long num2 = now.getTimeInMillis();
		
		long diff = (num1 - num2) / 1000 / 60 / 60 / 24;
		
		if(diff == 0)
			System.out.println("D-Day입니다.");
		else
			System.out.println("D-"+ diff + "일입니다.");
		
		
	}
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 입력 : ");
		int year = sc.nextInt();
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		System.out.print("일 입력 : ");
		int day = sc.nextInt();
		
		Calendar dDay = Calendar.getInstance();
		dDay.set(year, month-1, day);
				
		Calendar now = Calendar.getInstance();
		
		long num1 = dDay.getTimeInMillis();
		long num2 = now.getTimeInMillis();
		
		long diff = (num1 - num2) / 1000 / 60 / 60 / 24;   // 12 30 - 12 20
		long diff2 = (num2 - num1) / 1000 / 60 / 60 / 24;
		
		if(diff == 0)
			System.out.println("D-Day입니다.");
		else if (diff > 0)
			System.out.println("D-"+ diff+1 + "일입니다.");
		else 
			System.out.println(diff2+1 + "일 지났습니다.");
	}	

}
