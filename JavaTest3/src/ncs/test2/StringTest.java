package ncs.test2;

public class StringTest {
	
	public static void main(String[] args) {
		
		String str = "1.22,4.12,5.93,8.71,9.34";
		
		double data[] = new double[5];
		double sum = 0;
		
		String[] st = str.split(",");
				
						
		int i = 0;
		for (String a : st) {
			data[i] = Double.parseDouble(a);
			System.out.printf("%.3f%n", data[i]);
			sum += data[i];

		}
		System.out.printf("합계 : %.3f%n", sum);
		double avg = sum/5;
		System.out.printf("평균 : %.3f", avg);
	}
}
