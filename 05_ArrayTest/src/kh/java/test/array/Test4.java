package kh.java.test.array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Test4 t4 = new Test4();
		t4.test1();
		System.out.println();
		t4.test2();

	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전번 입력 : ");
		String pNum = sc.nextLine();
		
		String cppNum1 = pNum.substring(0, 3);
		String cppNum2 = pNum.substring(7, 11);
		System.out.println(cppNum1 + " - **** - " +cppNum2);
				
	}

	public void test1() {
		
		//1.전번입력
		Scanner sc = new Scanner(System.in);
				
		System.out.print("전번 입력 : ");
		String pNum = sc.nextLine();
		
		char[] pnArr = new char[11];
		
		//2.배열입력
		for(int i = 0; i < pnArr.length; i++) {
			pnArr[i] = pNum.charAt(i);
		}
		
		//3.원본 출력
		for(int i = 0; i < pnArr.length; i++) {
			System.out.print(pnArr[i]);
		}
		
		System.out.println();
		
		//4.clone 복사
		char[] cppnArr1 = pnArr.clone();
		
		//4.1 clone 출력
		for(int i = 0; i < pnArr.length; i++) {
		System.out.print(cppnArr1[i]);
		}
		
		System.out.println();
		
		//5.가운데 4자리 *가리기
		char[] ast = new char[pnArr.length];
		//5.1 *배열 만들기
		for(int i = 0; i < pnArr.length; i++) {
			ast[i] = '*';
		}
		//5.2 복사본에 *배열 복사
		System.arraycopy(ast, 0, cppnArr1, 3, 4);
				
		//단순 대입
//		System.arraycopy(cppnArr1, 0, cppnArr2, 0, pnArr.length);
//		cppnArr2[3] = '*';
//		cppnArr2[4] = '*';
//		cppnArr2[5] = '*';
//		cppnArr2[6] = '*';
		
		//6. 가린후 복사본 출력
		for(int i = 0; i < pnArr.length; i++) {
		System.out.print(cppnArr1[i]);
		}
		
	}
	
}
