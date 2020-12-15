package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		//t3.test();
		//t3.test2();
		//t3.test3();
		t3.test4();
	}

	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag = true;
		while(true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					continue;
			} else {
				break;
			}
		}
		//소수는 2부터 num/2 까지 나누었을 때 나누어지는 숫자가 존재하지 않으면 소수
		//num의 약수는 num/2보다 클수 없으므로 2부터 루트 num
		//루트 표현위해 j*j<=i
			
		for(int i = 2; i<=num; i++) {
			for(int j = 2; j <= i/2; j++) {
				if(i%j == 0) {
					flag = false;
					break;
				} else 
					flag = true;
					break;
			}
		}
			if(flag) {
				System.out.println("소수");
				
			} else {
				System.out.println("소수 아님");
			}
	}
		
	//이하 버림
	
	

//	public void test3() {
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		
//		do {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			
//			if(num < 2) {
//				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
//					continue;
//			}
//			//3부터 2씩증가하는 수(홀수)로 차례로 나누어본다.
//			//나누어지는 수가 있으면, 소수가 아니다.
//			//나누어 지는 수가 없으면, 1과 본인밖에 약수가 없으므로 소수이다. 
//			
//			int i = 1;
//			while(i < num) {
//					i++;
//				if(num % 2 != 0) {    //2로 나누면 홀수 나타낸다는 말
//					System.out.println(num + "은 소수다.");
//					break;
//				}else 					
//					System.out.println(num + "은 소수아니다.");
//					break;
//			}	break;
//			
//		} while(true);
//		
//	}
//
//	public void test2() {
//		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		for(int i = 0; ; i++) {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			if(num>2)
//				break;
//			else
//				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
//				continue;
//		}
//		for(int i = 2; ; i++) {
//			if(num % 2 != 0) {
//				System.out.println("소수다.");
//				break;
//			} else 
//				System.out.println("소수가 아니다");
//				break;
//		}
//	}
//
//	public void test() {
//		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		while(true) {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();		//i++이 컨티뉴 뒤에 있는 경우는 무한 반복
//			if(num > 2)  	
//				break;			
//			else 
//				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");//
//				continue;
//		}
//		int i = 1;
//		while(i <= num) {
//			i++;
//			if(num % i != 0) {
//				System.out.println("소수다.");
//				break;
//			} else 
//				System.out.println("소수가 아니다.");
//				break;
//		}
//	}
}
	
		
		

	


