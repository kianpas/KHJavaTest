package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		
		Calendar cal = new GregorianCalendar();
		cal.set(1987, Calendar.MAY, 27);
		Calendar cal2 = new GregorianCalendar();
		cal2.set(2021, Calendar.JANUARY, 8);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(sdf.format(cal2.getTime()));
		
		long birth = cal.getTimeInMillis();
		long today = cal2.getTimeInMillis();
		
		long diff = today - birth;
		long diffcal = diff/1000/60/60/24;
		
		System.out.println("나이 : " + diffcal/365 + " 세");
	}

}
