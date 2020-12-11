package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
	
	public static void main(String[] args) {
		SwitchTest1 st1 = new SwitchTest1();
		st1.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------menu-------");
		System.out.println("1. 가정용 (50원/liter)");
		System.out.println("2. 상업용 (45원/liter)");
		System.out.println("3. 공업용 (30원/liter)");
		System.out.println("------------------");
		
		System.out.print("메뉴번호를 선택하세요. ==> ");
		int num = sc.nextInt();
		
		System.out.print("물 사용량을 입력하세요. ==> ");
		int usage = sc.nextInt();
		
		int usprice1 = usage*50;
		int usprice2 = usage*45;
		int usprice3 = usage*30;
		
		System.out.println("-----<<수도세>>-----");
		switch (num) {
		case 1 :
			System.out.println("선택메뉴번호 : 1. 가정용(집에서 사용하실 경우)를 선택하셨습니다.");
			System.out.println("사용요금 : " + usprice1);
			System.out.println("수도세 : " + (int)(usprice1*0.05));
			System.out.println("총수도요금 : " + (int)(usprice1 + (usprice1*0.05))  +"원");
			break;
		case 2 :
			System.out.println("선택메뉴번호 : 2. 상업용(업소에서 사용하실 경우)를 선택하셨습니다.");
			System.out.println("사용요금 : " + usprice2);
			System.out.println("수도세 : " + (int)(usprice2 * 0.05));
			System.out.println("총수도요금 : " + (int)(usprice2 + (usprice2*0.05)) + "원");
			break;
		case 3 :
			System.out.println("선택메뉴번호 : 3. 공업용(공장에서 사용하실 경우)를 선택하셨습니다.");
			System.out.println("사용요금 : " + usprice3);
			System.out.println("수도세 : " + (int)(usprice3 * 0.05));
			System.out.println("총수도요금 : " + (int)(usprice3 + (usprice3*0.05)) + "원");
			break;
		default :
			System.out.println("메뉴번호는 1, 2,3만 가능합니다.");
		}
	}
}
