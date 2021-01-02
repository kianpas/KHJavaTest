package com.api.member.run;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {
	
	public static void main(String[] args) {
		
		Member m = new Member();
		//Member[] mArr = new Member[3];
		String[] arr = null;
		String info = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		
		//StringTokenizer token = new StringTokenizer(info, "|");
		//split으로 자르기
		String[] splitinfo = info.split("\\|");
		//잘린정보 확인
		System.out.println(Arrays.toString(splitinfo));
		//확인
		String[] mem1 = splitinfo[0].split(",");
		System.out.println(Arrays.toString(mem1));
		
		String[] mem2 = splitinfo[1].split(",");
		System.out.println(Arrays.toString(mem2));
		
		String[] mem3 = splitinfo[2].split(",");
		System.out.println(Arrays.toString(mem3));
		
		//,으로 잘라서 배열에 저장 출력
		for(int i = 0; i<splitinfo.length; i++) {
			String[] str = splitinfo[i].split(",");
					
			m.setMemberNo(Integer.parseInt(str[0]));
			m.setMemberName(str[1]);
			m.setHeight(Integer.parseInt(str[2]));
			m.setWeight(Integer.parseInt(str[3]));
			
			//생년월일 잘라서 지정
			int year = Integer.parseInt(str[4].substring(0, 4));
			int month = Integer.parseInt(str[4].substring(4, 6));
			int day = Integer.parseInt(str[4].substring(6, 8));
			m.setBirth(new GregorianCalendar(year, month, day));
			
			System.out.println(m.information());
		}
			
			
		}
}
		//|를 기준으로 자르고 각각 문자열로 저장
//		while(token.hasMoreTokens())
//			String[] mem = token.nextToken();
		
//		String mem1 = token.nextToken();
//		String mem2 = token.nextToken();
//		String mem3 = token.nextToken();
		
		//김연아
		//,를 기준으로 자름
//		StringTokenizer tokenmem1 = new StringTokenizer(mem1, ",");
//				
//		Calendar cal = Calendar.getInstance();
//		cal.set(1990, Calendar.SEPTEMBER+1, 5);
//		
//		mArr[0] = new Member(Integer.parseInt(tokenmem1.nextToken()), tokenmem1.nextToken(), 
//				Integer.parseInt(tokenmem1.nextToken()), Integer.parseInt(tokenmem1.nextToken()), cal);
//				
//				
//		//양세형
//		StringTokenizer tokenmem2 = new StringTokenizer(mem2, ",");
//		
//		Calendar cal2 = Calendar.getInstance();
//		cal2.set(1985, Calendar.AUGUST+1, 18);
//		
//		mArr[1] = new Member(Integer.parseInt(tokenmem2.nextToken()), tokenmem2.nextToken(), 
//				Integer.parseInt(tokenmem2.nextToken()), Integer.parseInt(tokenmem2.nextToken()), cal2);
//				
//				
//		//김래원
//		StringTokenizer tokenmem3 = new StringTokenizer(mem3, ",");
//
//		Calendar cal3 = Calendar.getInstance();
//		cal3.set(1981, Calendar.MARCH + 1, 19);
//		
//		mArr[2] = new Member(Integer.parseInt(tokenmem3.nextToken()), tokenmem3.nextToken(),
//				Integer.parseInt(tokenmem3.nextToken()), Integer.parseInt(tokenmem3.nextToken()), cal3);
//
//		//배열 출력
//		for(int i = 0; i < mArr.length; i++)
//			System.out.println(mArr[i].information());
		
//		}
//
//}
//public static void main(String[] args) {
//	String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
//	//1. | 기준으로 분리
//	StringTokenizer token = new StringTokenizer(str,"|");
//	//3. Member배열 선언
//	Member[] memberArr = new Member[token.countTokens()];
//	int i = 0;	//index변수
//	while(token.hasMoreTokens()){
//		//2. , 기준으로 분리
//		String memberStr =  token.nextToken();
//		String[] mStr = memberStr.split(",");
//		//2.1 분리한데이터를 Member에 담기
//		Member m = new Member();
//		//2.1.1 String타입은 그냥 대입
//		//2.1.2 int타입은 Integer.parseInt로 형변환
//		//2.1.3 Calendar타입은 19900905를 parsing해서 년월일 정보 얻은후 Calendar에 대입
//		m.setMemberNo(Integer.parseInt(mStr[0]));
//		m.setMemberName(mStr[1]);
//		m.setHeight(Integer.parseInt(mStr[2]));
//		m.setWeight(Integer.parseInt(mStr[3]));
//		int yyyy = Integer.parseInt(mStr[4].substring(0,4));
//		int mm = Integer.parseInt(mStr[4].substring(4,6));
//		int dd = Integer.parseInt(mStr[4].substring(6));
//		m.setBirth(new GregorianCalendar(yyyy,mm-1,dd));
//		//3.1 Member배열에 추가
//		memberArr[i++] = m;
//	}	
//	//3.2 Member정보 열람
//	for(Member m : memberArr) {
//		System.out.println(m.infromation());
//	}
//}
//}
