package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Run run = new Run();
		run.test();
	}

	public void test() {
		
		Scanner sc = new Scanner(System.in);

		NumberProcess np = new NumberProcess();

		System.out.print("번호1 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("번호2 입력 : ");
		int n2 = sc.nextInt();

		if (np.checkDouble(n1, n2) == true)
			System.out.println(n2 + "의 배수이다.");
		else
			System.out.println("배수가 아니다.");

	}

}
