package workshop4;

public class Test05 {

	public static void main(String[] args) {

		int sum = 0;
		int cnt = 0;
		int input = Integer.parseInt(args[0]);
		for (int i = input; i <= 10; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				sum += i;
				cnt++;
				if (i * cnt <= sum) {
					System.out.print(i + "+");
				} else {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
		System.out.println("결과 : " + sum);

	}

}
