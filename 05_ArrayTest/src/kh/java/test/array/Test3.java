package kh.java.test.array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력값 : ");
		String str = sc.nextLine();
		
		System.out.print("검색값 : ");
		char ch = sc.next().charAt(0);
		
		char[] chArr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
					
		int index = 0;
		for (int i = 0; i < str.length(); i++)
			if(str.charAt(i) == ch) {
				index++; 
			}
		System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + ch + "은 " + index + "개 입니다.");
	}

}
