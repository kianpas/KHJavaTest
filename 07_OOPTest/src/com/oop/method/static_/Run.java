package com.oop.method.static_;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("영어 소문자 문자열 입력 : ");
		String str = sc.nextLine();

		// StaticMethod s = new StaticMethod();
		// static 메소드는 객체 만들 필요 없다

		System.out.println(StaticMethod.toUpper(str));

		System.out.print("문자열 입력 : ");
		String str2 = sc.nextLine();
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);

		StaticMethod.setChar(str2, num, ch);

		System.out.println();

		sc.nextLine();

		System.out.print("문자열 입력 : ");
		String str3 = sc.nextLine();

		System.out.println("알파벳 개수 : " + StaticMethod.getAlphabetLength(str3));

		System.out.print("첫번째 문자열 입력 : ");
		String str4 = sc.nextLine();
		System.out.print("두번째 문자열 입력 : ");
		String str5 = sc.nextLine();

		System.out.println("합친 문자열 : " + StaticMethod.concat(str4, str5));
	}

}
