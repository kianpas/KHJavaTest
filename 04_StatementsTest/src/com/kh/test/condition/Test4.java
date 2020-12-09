package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
	
		Test4 test4 = new Test4();
		test4.test();
		
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num % 2 != 0 && num > 0 && num <= 10 ) {
			System.out.println("홀수다.");
		} else if (num % 2 ==0 && num > 0 && num <= 10 ) {
			System.out.println("짝수다.");
		} else {
			System.out.println("반드시 1 ~ 10사이의 정수를 입력해야 합니다.");
		}
	}
}
