package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

/**
 * 
 * * 실행용 클래스 : com.oop.emp.run.EmpTest
메뉴작성 : 메소드 작성
=>메뉴 화면의 예
public void mainMenu(){}
******* 사원 정보 관리 프로그램 ************
    1. 새 사원 정보 입력  => empInput() 메소드 실행
    2. 사원 정보 삭제 => 참조변수에 null대입할  것.
    3. 사원정보 출력 =>  empOutput() 메소드 실행
    9. 끝내기
********************************************
 *
 */
public class EmpTest {

	public static void main(String[] args) {
		
		EmpTest emptest = new EmpTest();
		emptest.mainMenu();
		
		System.out.println();
		
	}
	
	public void mainMenu() {
		//올바른 답은 emp의 선언과 생성을 따로 하는 것
		//따로 할 수도 있다.
		//ex) Employee emp = null; 
		//emp = new Employee(); 식으로
		//삭제 시 emp = null;
		
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
			
		String menu = "******* 사원 정보 관리 프로그램 ******\n"
					+ "1. 새 사원 정보 입력 \n"
					+ "2. 사원 정보 삭제 \n"
					+ "3. 사원 정보 출력 \n"
					+ "9. 끝내기\n"
					+"*******************************";
		
		int num = 0;
		 
		do {
			System.out.println(menu);
			System.out.print("번호 선택 : ");
			num = sc.nextInt();

			switch (num) {

			case 1:
				System.out.println();
				emp.empInput();
				System.out.println();
				break;
			case 2:
				System.out.println();
				emp.setEmpNo(0);
				emp.setEmpName(null);
				emp.setDept(null);
				emp.setJob(null);
				emp.setAge(num);
				emp.setGender(' ');
				emp.setSalary(0);
				emp.setBonusPoint(0);
				emp.setPhone(null);
				emp.setAddress(null);
				System.out.println();
				break;
			case 3:
				System.out.println();
				emp.empOutput();
				System.out.println();
				break;
			case 9:
				System.out.println();
				break;
			}

		} while (num != 9);
			System.out.println("프로그램 종료");
			
	}

}
