package com.oop.method.nonstatic;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample n = new NonStaticSample();
		
		n.printLottoNumbers();
		
		System.out.println("\n=============");
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		System.out.print("문자 입력 : ");
//		char ch = sc.next().charAt(0);
		
//		n.outputChar(num, ch);
		
		System.out.println("\n=============");
		
		n.alphabet();
		
		System.out.println("=============");
		
		System.out.print("문장 입력 : ");
		String str = sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("첫번째 입력 : ");
		int x = sc.nextInt();
				
		System.out.print("두번째 입력 : ");
		int y = sc.nextInt();
		
		System.out.println(n.mySubstring(str, x, y));

	}

}
