package kh.java.test.array;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.test();
		
	}
	public void test() {
		
		int[] arr = new int[100];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+ i +"] = " + arr[i]);
		}
	}

}
