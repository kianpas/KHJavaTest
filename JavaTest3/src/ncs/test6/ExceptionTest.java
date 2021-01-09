package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) throws InvaildException {
		
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		int num = sc.nextInt();
		System.out.println(cal.getSum(num));;
		
		
	}
}
