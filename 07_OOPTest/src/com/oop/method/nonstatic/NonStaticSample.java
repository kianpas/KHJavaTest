package com.oop.method.nonstatic;

import java.util.Scanner;

/**
 * 
 * package com.oop.method.nonstatic;
public class NonStaticSample {
    
    //1. 반환값 없고 매개변수 없는 메소드
    //실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
    //메소드명 : printLottoNumbers
    
    
    //2. 반환값 없고 매개변수 있는 메소드
    //실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
    //메소드명 : outputChar
    
    
    //3. 반환값 있고 매개변수 없는 메소드
    //실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
    //메소드명 : alphabet
    
    
    //4. 반환값 있고 매개변수 있는 메소드
    //실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
    //추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
    //메소드명 : mySubstring
    
}

 *
 */
public class NonStaticSample {
	
	public void printLottoNumbers() {

		int[] lotto = new int[6];
		// 저장
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		// 0 ~ 5까지 반복
		for (int i = 0; i <= 5; i++) {
			// 전 위치 숫자와 비교
			for (int j = i + 1; j < 6; j++) {
				// 같은 경우 다시 랜덤
				if (lotto[i] == lotto[j]) {
					lotto[i] = (int) (Math.random() * 45) + 1;
				}

			}
			System.out.print(lotto[i] + " ");
		}

	}

	public void outputChar(int num, char ch) {

		for (int i = 0; i < num; i++) {
			System.out.print(ch + " ");
		}

	}

	public char alphabet() {

		char alphabet = (char) ((Math.random() * 57) + 'A');

		if (alphabet > 'Z') {
			alphabet = (char) ((Math.random() * 26) + 'a');
			System.out.println(alphabet);
		} else if (alphabet <= 'Z') {
			System.out.println(alphabet);
		}
		return alphabet;

	}

	public String mySubstring(String str, int x, int y) {
		if (str == null) {
			return null;
		} else {
			return str.substring(x, y);
		}
	}
}
