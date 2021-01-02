package com.io.test2;

import java.util.Scanner;

public class TestMyNote {

	public static void main(String[] args) {
		TestMyNote tmn = new TestMyNote();
		tmn.menu();

	}
	public static void menu() {
		
		MyNote mn = new MyNote();
		Scanner sc = new Scanner(System.in);
		
		int num;
		String menu = "*****  MyNote *****\n" + "1. 노트 새로 만들기\n" + "2. 노트 열기\n" 
						+ "3. 노트 열어서 수정하기\n" + "4. 끝내기\n" + "메뉴 선택 : ";
		
		do {
			System.out.print(menu);
			num = sc.nextInt();
			switch (num) {
			case 1:
				mn.fileSave();
				break;
			case 2:
				mn.fileOpen();
				break;
			case 3:
				mn.fileAppend();
				break;
			default:
				System.out.println("종료");
				
			}
		} while (num != 4);

	}

}
