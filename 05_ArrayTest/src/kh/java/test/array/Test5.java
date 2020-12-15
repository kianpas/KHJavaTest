package kh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Test5 t5 = new Test5();
		t5.test();

	}

	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		//1.주민 입력
		System.out.print("주민등록번호 입력 : ");
		String rNum = sc.nextLine();
		
		char[] rnArr = new char[13];
		
		//2.배열 입력
		for(int i = 0; i < rnArr.length; i++) {
			rnArr[i] = rNum.charAt(i);
		}
		//3.원본 출력
		for(int i = 0; i < rnArr.length; i++) {
			System.out.print(rnArr[i]);
		}
		System.out.println();
		
		//4. clone() 사용 복사
		char[] cprnArr1 = rnArr.clone();
		
		//4.1 clone 출력
		for(int i = 0; i < rnArr.length; i++) {
			System.out.print(cprnArr1[i]);
		}
		
			System.out.println();
				
		//5.*가리기
		char[] ast = new char[rnArr.length];
		//5.1 *배열 만들기
		for(int i = 0; i < rnArr.length; i++) {
			ast[i] = '*';
		}
		//5.2 복사본에 *배열 복사
		System.arraycopy(ast, 0, cprnArr1, 7, 6);
		
		//단순 대입
//		System.arraycopy(cprnArr1, 0, cprnArr2, 0, rnArr.length);
//		cprnArr2[7] = '*';
//		cprnArr2[8] = '*';
//		cprnArr2[9] = '*';
//		cprnArr2[10] = '*';
//		cprnArr2[11] = '*';
//		cprnArr2[12] = '*';
		
		//7. 복사본 출력
		for(int i = 0; i < rnArr.length; i++) {
		System.out.print(cprnArr1[i]);
		}
		
	}

}
