package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		Test4 t4 = new Test4();
		t4.test();
	
	}
	public void test() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("검색할 문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		int index = 0;
		//length가 5라면 위치는 4		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				index++; // 무한 제어
			} 
		}
		if ('a' <=ch && ch <= 'z') {
			System.out.println("'" + ch + "'" + "가 포함된 갯수 : " + index + "개");
		} else {
			System.out.println("영문자가 아닙니다.");
		}
	}	
}
		
		
//		String res = sc.nextLine();
		
		
//		char charAt(int location);
		
//		System.out.println(index);

		//문자열 1이 증가할때마다 검사?
			
//			}
//			if(index ) {
//				str.length = 0 > ch == 
//			
//				System.out.println("'" + ch + "'" + "가 포함된 갯수 : ");
		//	}
	
//		}
//	}
//}
