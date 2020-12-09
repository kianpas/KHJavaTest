package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2.test();
		
	}
	public void test() {
		int kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		int sum = (kor + eng + math);
		System.out.println("총점 : " + sum);
		
		double avg = (sum/3.0);
		System.out.println("평균 : " + avg);
				
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}
}
