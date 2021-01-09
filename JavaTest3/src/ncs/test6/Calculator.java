package ncs.test6;

public class Calculator {

	public double getSum(int data) throws InvaildException {

		int sum = data;
		if (data < 2 || data > 5)
			throw new InvaildException("입력 값에 오류가 있습니다.");
		else
			for (int i = 0; i < data; i++)
				sum += i;
		return sum;

	}
}
