package com.thread.alphabet;

public class AlphabetTest {
	
	public static void main(String[] args) {
		
		AlphabetTest a = new AlphabetTest();
		a.test();
	}

	private void test() {
	
		Thread tr1 = new Thread(new UpperAlphabetThread('A'));
		Thread tr2 = new Thread(new LowerAlphabetThread('a'));
		
		tr1.start();
		tr2.start();
	}


}
