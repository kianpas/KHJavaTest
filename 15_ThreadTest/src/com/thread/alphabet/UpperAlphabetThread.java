package com.thread.alphabet;

public class UpperAlphabetThread implements Runnable {

	private char c;

	public UpperAlphabetThread(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 26; i++)
			System.out.println((char)(c + i));
		
	}

}
