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
		// 랜덤 숫자 저장
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rnd.nextInt(100) + 1; // 랜덤숫자 넣기 배열 저장시 랜덤 지정
			}
		}
		// 확인차
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 배열 저장 확인
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// 각 행의 합계
		int sum[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
				// 각 행의 열의 합계 확인
			}
			System.out.println(sum[i]);

		}
		// 열의 합계가 5의 배수인 경우 출력
		for (int i = 0; i < arr.length; i++) {
			if (sum[i] % 5 == 0)
				for (int j = 0; j < arr[i].length; j++) {

					// 5의 배수 출력 확인
					System.out.print(arr[i][j] + " ");
				}
			System.out.println();
		}

	}
}