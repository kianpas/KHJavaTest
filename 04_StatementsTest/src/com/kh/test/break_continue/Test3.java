package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		//t3.test();
		//t3.test2();
		t3.test3();
	}

	public void test3() {
Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					continue;
			}
			
			int i = 1;
			while(i < num) {
					i++;
				if(num % 2 != 0) {
					System.out.println(num + "은 소수다.");
					break;
				}else 					
					System.out.println(num + "은 소수아니다.");
					break;
			}	break;
			
		} while(true);
		
	}

	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		for(int i = 0; ; i++) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if(num>2)
				break;
			else
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
		}
		for(int i = 2; ; i++) {
			if(num % 2 != 0) {
				System.out.println("소수다.");
				break;
			} else 
				System.out.println("소수가 아니다");
				break;
			
		}
	}

	public void test() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();		//i++이 컨티뉴 뒤에 있는 경우는 무한 반복
			if(num > 2)  	
				break;			
			else 
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");//
				continue;
		}
		int i = 1;
		while(i <= num) {
			i++;
			if(num % 2 != 0) {
				System.out.println("소수다.");
				break;
			} else 
				System.out.println("소수가 아니다.");
				break;
		}
	}
}
	
		
		

	


