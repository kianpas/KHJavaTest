package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.test1();
		t1.test2();
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 => ");
		int num = sc.nextInt();
		
		System.out.print("다른 정수를 하나 입력하세요 => ");
		int num2 = sc.nextInt();
		
		int big = 0; 
		int sml = 0;
		
		if(num < num2 && num != num2) {
			big = num2;
			sml = num;
		} else if (num > num2 && num != num2) {
			sml = num2;
			big = num;
		} else { 
			System.out.println("같은 숫자입니다.");
		}
		
		int sum = 0;
		
		for(int i = sml; i < big; i++) {
			if(i % 2 != 0)
				sum += i;
	
		 }System.out.println("=================");
		 
		 System.out.println(sml + "부터 " + big +"까지의 홀수의 합은 " + sum + "입니다.");

		int sum2 = 0;
		
		int i2 = sml;
		while(i2 < big) {
			if(i2 % 2 != 0) 
				sum2 += i2;
			i2++;
			
		}System.out.println(sml + "부터 " + big +"까지의 홀수의 합은 " + sum2 + "입니다.");
		
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
	
		for(int i = 0; i <= num; i++) {
			if(i % 2 != 0)
				sum += i;
			
		 }System.out.println(sum);
		 
		int sum2 = 0;
		int i2 = 0;
		while(i2<=num) {
			if(i2 % 2 != 0) 
				sum2 += i2;
			i2++; //1 증가는 나중에
			
		}System.out.println(sum2);
		
	} 
}
