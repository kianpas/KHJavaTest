package com.kh.test.condition;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Test9 test9 = new Test9();
		test9.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********주메뉴*********");
		System.out.println("a. 불고기버거 ---------5000");
		System.out.println("b. 새우버거 ---------4000");
		System.out.println("c. 치킨버거 ---------4500");
		System.out.println("d. 한우버거 ---------10000");
		System.out.println("e. 디버거 ---------7000");
		System.out.println("***********************\n");
		
		System.out.println("******사이드메뉴*********");
		System.out.println("1. 콜라 ---------1500");
		System.out.println("2. 사이다 ---------1500");
		System.out.println("3. 밀크쉐이크 ---------2500");
		System.out.println("4. 레드불 ---------3000");
		System.out.println("***********************");
		
		
		System.out.print("메뉴번호 입력 : ");
		
		char ch = sc.next().charAt(0);
		int num = sc.nextInt();
		String mm = ch == 'a' ? "불고기버거" : (ch == 'b' ? "새우버거" : (ch == 'c'? "치킨버거" : (ch == 'd'? "한우버거":"디버거")));
		int mp = ch == 'a' ? 5000 : (ch == 'b' ? 4000 : (ch == 'c'? 4500 : (ch == 'd'? 10000:7000)));
		
		String sm = num == 1 ? "콜라" : (num == 2 ? "사이다" : (num == 3 ? "밀크쉐이크" : "레드불"));
		int sp = num == 1 ? 1500 : (num == 2 ? 1500 : (num == 3 ? 2500 : 3000));
	
	if ((ch>='a'&& ch <='e') && (num>0 && num <5)) {
		System.out.println(mm + ", " + sm + "은(는) 총 " + (mp+sp) + "원입니다");
		} else {
			System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
		}
	}
}
//		String mm = null, sm = null;
//		int mp = 0, sp = 0;
//		
//		if (ch == 'a') {
//			mm = "불고기버거";
//			mp = 5000;
//		} else if (ch == 'b') {
//			mm = "새우버거";
//			mp = 4000;
//		} else if (ch == 'c') {
//			mm = "치킨버거";
//			mp = 4500;
//		} else if (ch == 'd') {
//			mm = "한우버거";
//			mp = 10000;
//		} else if (ch == 'e'){
//			mm = "디버거";
//			mp = 7000;
//	
//		}
//
//		switch (num) {
//		case 1 :
//			sm = "콜라";
//			sp = 1500;
//			break;
//		case 2 :
//			sm = "사이다";
//			sp = 1500;
//			break;
//		case 3 :
//			sm = "밀크 쉐이크";
//			sp = 2500;
//			break;
//		case 4 :
//			sm = "레드불";
//			sp = 3000;
//			break;
//		
//		} 
//		String result = num == 1 ? "가위" : (num == 2 ? "바위" : num == 3? "바위" : "다람쥐");
//		System.out.println(result);
//		if ((ch>='a'&& ch <='e') && (num>0 && num <5)) {
//			System.out.println(mm + ", " + sm + "은(는) 총 " + (mp+sp) + "원입니다");
//			} else {
//				System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다");
//			}
//		}
//}