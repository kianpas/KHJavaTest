package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;


/**
 * 
 * [객체배열 실습문제1]
<문제 1>
 - 클래스 : com.oop.coffee.model.dto.Coffee.java
 - control 클래스 작성 : com.oop.coffee.controller.CoffeeManager.java
 - 실행클래스 : com.oop.coffee.run.Run.java
        => main() 메소드 포함함
 - Coffee 멤버변수 원산지 origin, 지역 location
      기본생성자, 모든필드초기화생성자
      getter, setter
      출력메소드      ()
 - control클래스 구현내용.
    1. Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 3.
    2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각 객체에 기록함
    3. 출력 확인함
    <세계3대커피>
    ---------------------------
    원산지           지역
    ---------------------------
    예멘          모카마타리
    자메이카       블루마운틴
    하와이           코나
    ---------------------------
 - main() 에서 구현할 내용

 *
 */
public class CoffeeManager {

	private Scanner sc = new Scanner(System.in);
	private Coffee[] arr = new Coffee[3];

	//입력
	public void inputCoffee() {

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + " 원산지  : ");
			String origin = sc.next();
			System.out.print((i + 1) + " 지역 : ");
			String location = sc.next();
			Coffee c = new Coffee(origin, location);
			arr[i] = c;
		}
	}

	//출력
	public void printCoffee() {
		
		System.out.println("    <세계 3대 커피>" + "\n-----------------" + "\n원산지        지역" + "\n-----------------");
		//향상된 for문
		for (Coffee p : arr)
			p.printCoffee();
		
		System.out.println("-----------------");
	}
}
