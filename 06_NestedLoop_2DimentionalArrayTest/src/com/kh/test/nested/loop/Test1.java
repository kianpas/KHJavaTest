package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.test();

	}
	
	public void test() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("양수가 아닙니다");
		}
		for (int i = 0; i < num; i++) { // 행
			for (int j = 1; j < i + 2; j++) { // 열
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
