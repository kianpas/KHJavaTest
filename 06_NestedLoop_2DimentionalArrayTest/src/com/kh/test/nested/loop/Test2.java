package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Test2 t2 = new Test2();
		t2.test();

	}

	public void test() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("양수가 아닙니다");
		}
		for (int i = 0; i < num; i++) { // 행
			for (int j = 0; j < num - i; j++) { // 열 감소 0열
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
