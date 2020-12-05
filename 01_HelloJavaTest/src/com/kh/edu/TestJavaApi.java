package com.kh.edu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJavaApi {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat simdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = simdf.format(date);
		System.out.println(today);
		
	}

}
