package com.exception.rnd;

import java.util.Scanner;

public class NumberOk {

	int rndNum;
	static int cnt;

	public static void main(String[] args) {

		NumberOk no = new NumberOk();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';

		try {
			no.rndNumber();

			while (true) {

				int num = no.getNumber();
				int result = no.checkNumber(num);

				cnt++;

				if (result == 1) {
					System.out.println("입력한 숫자보다 작습니다.");

				} else if (result == -1) {
					System.out.println("입력한 숫자보다 큽니다.");

				} else if (result == 0) {
					System.out.println("정답입니다." + cnt + "회에 만에 정답을 맞추셨습니다.");

					System.out.print("계속 하시겠습니까?(y/n) : ");
					ch = sc.next().charAt(0);
					if (ch == 'n') {
						System.out.println("프로그램을 종료합니다.");
					} else {
						no.rndNumber();
					}

				}

			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}

	public int checkNumber(int num) {
		int re;

		System.out.println(rndNum);
		if (num == rndNum)
			return re = 0;
		else if (num < rndNum)
			return re = -1;
		else
			return re = 1;

	}

	public int getNumber() throws RuntimeException {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if (num >= 1 && num <= 100)
			return num;
		else {
			throw new RuntimeException("1부터 100사이의 값이 아닙니다.");

		}
	}

	public void rndNumber() {

		rndNum = (int) (Math.random() * 100) + 1;

		cnt = 0;
	}

}
