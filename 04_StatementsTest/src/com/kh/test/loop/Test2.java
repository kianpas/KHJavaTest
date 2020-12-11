package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		t2.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String res = null;
		
		for(int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				res = "박";
			} else {
				res = "수";
			}
			System.out.print(res);
		}
		
	}

}
