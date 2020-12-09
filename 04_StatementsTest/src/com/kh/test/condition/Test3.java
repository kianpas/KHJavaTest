package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		Test3 test3 = new Test3();
		test3.test();
		
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		char ch = sc.next().charAt(0);
		if(ch == '+') {
			System.out.println(a +" + " + b + " = " + (a + b));
		} else if (ch == '-') {
			System.out.println(a +" - " + b + " = " + (a - b));
		} else if (ch == '*') {
			System.out.println(a +" * " + b + " = " + (a * b));
		} else if (ch == '/') {
			System.out.println(a +" / " + b + " = " + (a / b));
		} else {
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");
		}
	}
}
