package com.oop.movie.model.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class MovieRun {

	public static void main(String[] args) {
		
		//캐스팅 목록 생성
		String[] casting1 = { "1", "2", "3", "4", "5"};
		String[] casting2 = { "a", "b", "c", "d", "e" };
		String[] casting3 = { "ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ" };
		String[] casting4 = { "A", "B", "C", "D", "E" };
		
		//날짜 지정
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.YEAR, 1999);
		cal1.set(Calendar.MONTH, 5);
		cal1.set(Calendar.DATE, 15);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2003);
		cal2.set(Calendar.MONTH, 5);
		cal2.set(Calendar.DATE, 15);
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(Calendar.YEAR, 2003);
		cal3.set(Calendar.MONTH, 11);
		cal3.set(Calendar.DATE, 5);
		
		Calendar cal4 = Calendar.getInstance();
		cal4.set(Calendar.YEAR, 2021);
		cal4.set(Calendar.MONTH-1, 12);
		cal4.set(Calendar.DATE, 22);
				
		//생성자별로 객체 생성
		Movie fm1 = new Movie("매트릭스1");
		Movie fm2 = new Movie("매트릭스1", "가");
		Movie fm3 = new Movie("매트릭스1", "가", casting1);
		Movie fm4 = new Movie("매트릭스1", "가", casting1, cal1);
		
		//출력
		System.out.println(fm1.information());
		System.out.println(fm2.information());
		System.out.println(fm3.information());
		System.out.println(fm4.information());
		
		Movie sm1 = new Movie("매트릭스2");
		Movie sm2 = new Movie("매트릭스2", "나");
		Movie sm3 = new Movie("매트릭스2", "나", casting2);
		Movie sm4 = new Movie("매트릭스2", "나", casting2, cal2);
		
		System.out.println(sm1.information());
		System.out.println(sm2.information());
		System.out.println(sm3.information());
		System.out.println(sm4.information());
		
		Movie tm1 = new Movie("매트릭스3");
		Movie tm2 = new Movie("매트릭스3", "다");
		Movie tm3 = new Movie("매트릭스3", "다", casting3);
		Movie tm4 = new Movie("매트릭스3", "다", casting3, cal3);
		
		System.out.println(tm1.information());
		System.out.println(tm2.information());
		System.out.println(tm3.information());
		System.out.println(tm4.information());
		
		Movie fourm1 = new Movie("매트릭스4");
		Movie fourm2 = new Movie("매트릭스4", "라");
		Movie fourm3 = new Movie("매트릭스4", "라", casting4);
		Movie fourm4 = new Movie("매트릭스4", "라", casting4, cal4);
		
		System.out.println(fourm1.information());
		System.out.println(fourm2.information());
		System.out.println(fourm3.information());
		System.out.println(fourm4.information());
		
	}

}
