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
		
		//char ch = sc.next().charAt(0);
		String res = sc.nextLine();
		
		int index = str.indexOf(res);
//		
//		System.out.println(index);

		//문자열 1이 증가할때마다 검사?
		for(int i = 0; i <= str.length() ; i++) {
//			if()
			
			
			
			System.out.println(index);
//			if(index ) {
//				str.length = 0 > ch == 
//			
//				System.out.println("'" + ch + "'" + "가 포함된 갯수 : ");
		//	}
	
		}
	}
}
