package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 t4 = new Test3();
		t4.test();
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
	
		
		
//		for(int i = 1; i<=num; i++) { //중간에 빈 경우는 무한 반복 
//			if(num % 2 != 0) {				
//				System.out.println("소수 입니다.");
//					break;		//for 에서는 증감식으로 돌아감
//			}else 
//				System.out.println("소수 아닙니다.");
//					break;
//		}

	


