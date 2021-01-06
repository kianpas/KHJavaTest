package com.thread.alphabet;

public class LowerAlphabetThread implements Runnable {

	private char c;

	public LowerAlphabetThread(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 26; i++)
			System.out.println((char)(c + i));
		
		
	}

}
