package workshop4;

public class Test04 {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		int result = c.calculate(Integer.parseInt(args[0]));
		System.out.println();
		System.out.println("결과 : " + result);
	}

}
