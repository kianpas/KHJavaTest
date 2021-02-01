package workshop4;

public class Test02 {

	public static void main(String[] args) {
		int [] arr3 = new int[5];
		
		
		
		for(int i = 0; i<arr3.length; i++) {
			int rndNum = (int) (Math.random()*10 + 1);
			arr3[i] = rndNum;
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i<arr3.length; i++) {
			sum += arr3[i];
		}
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum/arr3.length);
		
	}

}
