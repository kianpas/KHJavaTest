package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		test1.test1();
		test1.test2();
		test1.test3();
		
	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		
		if (sum >= 250) {
			System.out.println("우수생입니다.");
		}
		
		
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("A 연봉 : ");
		int sal1 = sc.nextInt();
		
		System.out.print("B 연봉 : ");
		int sal2 = sc.nextInt();
		
		System.out.print("C 연봉 : ");
		int sal3 = sc.nextInt();
		
		if (sal1 >= 5000) {
			System.out.println("A는 고액연봉자입니다.");
		} 
		if (sal2 >= 5000) {
			System.out.println("B는 고액연봉자입니다.");
		}
		if (sal3 >= 5000) {
			System.out.println("C는 고액연봉자입니다.");
		}
		
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수다");
			
		} else {
			System.out.println("홀수다");
		}
//		boolean bool = (num%2==0);
//		if(bool) System.out.println("짝수다.");
//		else System.out.println("홀수다.");
		//boolean 형으로 도 가능
	}
}
