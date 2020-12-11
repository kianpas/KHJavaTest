package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	}
	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	

	}

}
