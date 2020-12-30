package com.api.member.run;

import java.util.Calendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {
	
	public static void main(String[] args) {
		
		Member[] mArr = new Member[3];
		
		String info = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		
		StringTokenizer token = new StringTokenizer(info, "|");
		
		//|를 기준으로 자르고 각각 문자열로 저장
		String mem1 = token.nextToken();
		String mem2 = token.nextToken();
		String mem3 = token.nextToken();
		
		//김연아
		//,를 기준으로 자름
		StringTokenizer tokenmem1 = new StringTokenizer(mem1, ",");
		
		Calendar cal = Calendar.getInstance();
		cal.set(1990, Calendar.SEPTEMBER+1, 5);
		
		mArr[0] = new Member(Integer.parseInt(tokenmem1.nextToken()), tokenmem1.nextToken(), 
				Integer.parseInt(tokenmem1.nextToken()), Integer.parseInt(tokenmem1.nextToken()), cal);
				
				
		//양세형
		StringTokenizer tokenmem2 = new StringTokenizer(mem2, ",");
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1985, Calendar.AUGUST+1, 18);
		
		mArr[1] = new Member(Integer.parseInt(tokenmem2.nextToken()), tokenmem2.nextToken(), 
				Integer.parseInt(tokenmem2.nextToken()), Integer.parseInt(tokenmem2.nextToken()), cal2);
				
				
		//김래원
		StringTokenizer tokenmem3 = new StringTokenizer(mem3, ",");

		Calendar cal3 = Calendar.getInstance();
		cal3.set(1981, Calendar.MARCH + 1, 19);

		
		mArr[2] = new Member(Integer.parseInt(tokenmem3.nextToken()), tokenmem3.nextToken(),
				Integer.parseInt(tokenmem3.nextToken()), Integer.parseInt(tokenmem3.nextToken()), cal3);

		//배열 출력
		for(int i = 0; i < mArr.length; i++)
			System.out.println(mArr[i].information());
		
		}

}
