package com.oop.emp.model;

import java.util.Scanner;

/**
 * 클래스명 : com.oop.emp.model.Employee
    - 사원정보 관리용 클래스
    - Field 작성 : 캡슐화 반드시 적용함
    사번 : - empNo:int
    이름 : - empName:String
    소속부서 : - dept:String
    직급 : - job:String
    나이 : - age:int
    성별 : - gender:char
    급여 : - salary:int
    보너스포인트 : - bonusPoint:double
    핸드폰 : - phone:String
    주소 : - address:String
Employee 클래스의 메소드 작성
1. 키보드입력용 메소드 : empInput()
2. emp객체 모든 필드 출력용 메소드 : empOutput()
3. getter/setter메소드

 * 
 */
public class Employee {

	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void empInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 사번 입력 : ");
		empNo = sc.nextInt();
		
		System.out.print("2. 이름 입력 : ");
		empName = sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("3. 소속 부서 입력 : ");
		dept = sc.nextLine();
		
		System.out.print("4. 직급 입력 : ");
		job = sc.nextLine();
		
		System.out.print("5. 나이 입력 : ");
		age = sc.nextInt();
		
		System.out.print("6. 성별 입력 : ");
		gender = sc.next().charAt(0);
		
		System.out.print("7. 급여 입력 : ");
		salary = sc.nextInt();
		
		System.out.print("8. 보너스 포인트 입력 : ");
		bonusPoint = sc.nextDouble();
		
		System.out.print("9. 핸드폰 입력 : ");
		phone = sc.next();
		
		sc.nextLine();
		
		System.out.print("10. 주소 입력 : ");
		address = sc.nextLine();
		
		
	}
	
	public void empOutput() {
		
		String inputinfo = "1. 사번 : " + empNo + "\n2. 이름 : " + empName + "\n3. 소속 부서 : " + dept
							+ "\n4. 직급 : " + job + "\n5. 나이 : " + age + "\n6. 성별 : " + gender
							+ "\n7. 급여 : " + salary + "\n8. 보너스 포인트 : " + bonusPoint + "\n9. 핸드폰 : " + phone
							+ "\n10. 소속 부서 : " + address;
		
		System.out.println(inputinfo);
		
				
	}
}
