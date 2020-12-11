package com.kh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	
	public static void main(String[] args) {
		RandomTest rndtest = new RandomTest();
		rndtest.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		int num = sc.nextInt();
		
		Random rnd = new Random();
		int rps = rnd.nextInt(3)+1;
		System.out.println("======== 결과 ========");
		
		String result = num == 1 ? "가위" : (num == 2 ? "바위" : "보");
		String cresult = rps == 1 ? "가위" : (rps == 2 ? "바위" : "보");
		
		System.out.println("당신은 " + result + "를 냈습니다.");
		System.out.println("컴퓨터는 " + cresult + "를 냈습니다." );
		
		System.out.println("====================");
		
		if((num == 1 && rps == 3 ) || (num == 2 && rps == 1) || (num == 3 && rps == 2)) {
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
	}
}
		/**
		 *  user    win   lose
		 * -----------------------
		 *     1     3     2
		 * 	   2     1     3
		 *     3     2     1
		 * -----------------------
		 * 1. 사용자 < 컴퓨터 + 3
		 * 2. 이기는 경우
		 *      4      3
		 *      2      1
		 *      3      2
		 *  
		 *     
		 */    


//		if (num == 1) {
//			System.out.println("당신은 가위를 냈습니다.");
//			
//		} else if (num == 2) {
//			System.out.println("당신은 바위를 냈습니다.");
//			
//		} else if (num == 3) {
//			System.out.println("당신은 보를 냈습니다.");
//		}
//		
//		if (rps == 1) {
//			System.out.println("컴퓨터는 가위를 냈습니다.");
//			
//		} else if (rps == 2) {
//			System.out.println("컴퓨터는 바위를 냈습니다.");
//			
//		} else if (rps == 3) {
//			System.out.println("컴퓨터는 보를 냈습니다.");
//		}
//		System.out.println("====================");
//		
//		if((num == 1 && rps == 3 ) || (num == 2 && rps == 1) || (num == 3 && rps == 2)) {
//			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
//			
//		} else if ((num == 1 && rps == 1 ) || (num == 2 && rps == 2) || (num == 3 && rps == 3)) {
//			System.out.println("비겼습니다. ㅠ.ㅠ");
//			
//		} else if ((num == 1 && rps == 2 ) || (num == 2 && rps == 3) || (num == 3 && rps == 1)) {
//			System.out.println("당신은 졌습니다. ㅠ.ㅠ");
	
//		}
//	}
//}
