package kh.java.test.array;

public class Test2 {

	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		t2.test();
		t2.test2();
		t2.test3();
		t2.test4();
	}

	private void test4() {
		
		String[] arr =  {"딸기","복숭아","키위","사과","바나나"};
		System.out.println(arr[4]);	
	}

	private void test3() {
		
		String[] arr;
		arr = new String[5];
		arr[0] = "딸기";
		arr[1] = "복숭아";
		arr[2] = "키위";
		arr[3] = "사과";
		arr[4] = "바나나";
		
		System.out.println(arr[4]);	
					
	}

	private void test2() {
		String[] arr = new String[] {"딸기","복숭아","키위","사과","바나나"};
		System.out.println(arr[4]);
	}

	public void test() {
	
		String[] arr = new String[5];
		arr[0] = "딸기";
		arr[1] = "복숭아";
		arr[2] = "키위";
		arr[3] = "사과";
		arr[4] = "바나나";
		
		System.out.println(arr[4]);
		
	}

}
