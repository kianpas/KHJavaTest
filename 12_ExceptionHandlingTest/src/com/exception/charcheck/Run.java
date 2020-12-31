package com.exception.charcheck;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		CharacterProcess cp = new CharacterProcess();
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();

		try {
			System.out.println("영문자 개수 : " + cp.countAlpha(s));
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
}
