package com.kh.function;

import java.util.Scanner;

public class Example {
	
	public void opSample1() {
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
				
		System.out.println(sum >= 40 && avg >= 60 ? "합격" : "불합격");
	}
	public void opSample2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int clss = sc.nextInt();
		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char sex = sc.next().charAt(0);
		
		System.out.print("성적 : ");
		double point = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s학생 %s은 성적이 %.2f이다.", grade, clss, num, sex, name, point);
		
	}
}
