package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.test();
	}
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num <= 9 && num >= 1) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(num + "X" + i + "="+(num*i));
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램 종료합니다");
		}
	}
}
