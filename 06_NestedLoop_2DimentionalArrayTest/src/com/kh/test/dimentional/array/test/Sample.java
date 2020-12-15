package com.kh.test.dimentional.array.test;

import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.exercise1();

	}

	public void exercise1() {

		Random rnd = new Random();

		int[][] arr = new int[3][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rnd.nextInt(100) + 1; // 랜덤숫자 넣기 배열 저장시 랜덤 지정
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 5 == 0)
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}