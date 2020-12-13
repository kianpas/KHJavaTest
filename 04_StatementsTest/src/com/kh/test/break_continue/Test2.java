package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		//t2.test();
		//t2.test2();
		//t2.test3();
		t2.test4();
		

	}
	public void test4() {
		int rnd = (int) (Math.random()*100+1);
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
	
		while(true) {
			System.out.print("정수 입력 (1 ~ 100) : ");
			int num = sc.nextInt();
				cnt++;
				
			if (num > 100 || num < 1) {
					System.out.println("잘 못 입력하셨습니다.");
					continue;
			}	
								
			if(num < rnd) {
				System.out.println("입력하신 정수보다 큽니다.");
				continue;
			}
			if (num > rnd){
				System.out.println("입력하신 정수보다 작습니다.");
				continue;
			}
			
			if (num == rnd) {
				System.out.println("정답입니다." + cnt + "회에 만에 정답을 맞추셨습니다." );
				break;
			}
		}
	}
	public void test3() {
		Random rnd = new Random();
		int rndnum = rnd.nextInt(100)+1;
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		for(int i = 0; ; i++) {
			System.out.print("정수 입력 (1 ~ 100) : ");
			int num = sc.nextInt();
				cnt++;
			if(num < rndnum) {
				System.out.println("입력하신 정수보다 큽니다.");
				continue;
			} 
			if (num > rndnum){
				System.out.println("입력하신 정수보다 작습니다.");
				continue;
				
			} 
			if (num == rndnum) {
				System.out.println("정답입니다." + cnt + "회에 만에 정답을 맞추셨습니다." );
				break;
			}
		}
		
	}
		
	
	public void test2() {
		
		Random rnd = new Random();
		int rndnum = rnd.nextInt(100)+1;
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while(true) {
			System.out.print("정수 입력 (1 ~ 100) : ");
			int num = sc.nextInt();
				cnt++;
			if(num < rndnum) {
				System.out.println("입력하신 정수보다 큽니다.");
				continue;
			}
			if (num > rndnum){
				System.out.println("입력하신 정수보다 작습니다.");
				continue;
				
			} 
			if (num == rndnum) {
				System.out.println("정답입니다." + cnt + "회에 만에 정답을 맞추셨습니다." );
				break;
			}
		}
		
	}
	public void test() {
		
		Random rnd = new Random();
		int rndnum = rnd.nextInt(100)+1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		int cnt = 0;
		
		while(true) {
			int num = sc.nextInt();
				cnt++;
			if(num < rndnum) {
				System.out.println("입력하신 정수보다 큽니다.");
			} else if (num > rndnum){
				System.out.println("입력하신 정수보다 작습니다.");
			} else if (num == rndnum) {
				System.out.println("정답입니다." + cnt + "회에 만에 정답을 맞추셨습니다." );
				break;
			}
		}
	}
}

		
		
		
	