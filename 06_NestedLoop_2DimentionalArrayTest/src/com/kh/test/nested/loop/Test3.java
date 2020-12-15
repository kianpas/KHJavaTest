package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.test();

	}

	public void test() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("양수가 아닙니다");
		}
		for (int i = 0; i < num; i++) { // 행
			for (int j = 0; j < i + 1; j++) { // 열 감소 0열
				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = 0; k < num - 1; k++) { // 행
			for (int j = 0; j < k + 1; j++) { // 열 감소 0열
				System.out.print(" ");
			}

			for (int j = 0; j < num - (k + 1); j++) { // 열 감소 0열
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
