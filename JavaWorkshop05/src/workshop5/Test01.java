package workshop5;

public class Test01 {

	public static void main(String[] args) {

		char[] charr = args[0].toCharArray();

		// charr 확인
		for (int i = 0; i < charr.length; i++) {
			System.out.print(charr[i] + " ");
		}

		System.out.println();

		//역순 출력
		for (int i = charr.length - 1; i >= 0; i--) {
			System.out.print(charr[i]);
		}
	}
}
