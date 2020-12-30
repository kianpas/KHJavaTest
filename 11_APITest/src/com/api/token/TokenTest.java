package com.api.token;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		
		TokenTest token = new TokenTest();
		token.test1();

	}

	public void test1() {
		
		char[] chArr = new char[11];
		String str = "J a v a P r o g r a m";
		
		//토큰 처리전 글자 출력
		System.out.println(str);
		//처리전 글자갯수 출력
		System.out.println(str.length());
		
		StringTokenizer token = new StringTokenizer(str, " ");
		
		int i = 0;
		while (token.hasMoreTokens()) {
			//토큰 처리 후 글자갯수 출력 확인
			System.out.print(token.countTokens() + " ");
			//char [] 에 저장
			chArr[i] = (token.nextToken()).charAt(0);
			i++;
		}
		
		System.out.println();

		// char [] 값 출력
		for (int j = 0; j < chArr.length; j++)
			System.out.print(chArr[j]);

		System.out.println();

		// char[] String으로 바꿈
		String str2 = "";
		for (int j = 0; j < chArr.length; j++)
			str2 += chArr[j];

		// String 출력
		System.out.println(str2);

		// String 대문자로 출력
		System.out.println(str2.toUpperCase());
	}
}
