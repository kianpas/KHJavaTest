package workshop4;

public class Test06 {

	public static void main(String[] args) {
		
		if(args[0] == null || args[1] == null) {
			System.out.println("다시 입력 하세요");
		}
		
		if(Integer.parseInt(args[0]) < 1 && Integer.parseInt(args[0]) > 5) {
			System.out.println("숫자를 확인 하세요");
		}
		
		
		int[][] arr = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		
		//System.out.println(args[0] + "  " + args[1]);
		
		double sum = 0;
		for(int i = 0; i<Integer.parseInt(args[0]); i++) {
			for(int j = 0; j<Integer.parseInt(args[1]); j++) {
				int rndNum = (int) (Math.random()*5+1);
				arr[i][j] = rndNum;
				System.out.print(arr[i][j] + " ");
				sum +=	arr[i][j];
			
			}
						
		}
		System.out.println();
		System.out.println("sum = " + sum);
		System.out.println("avg = " +sum/(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		
	}

}
