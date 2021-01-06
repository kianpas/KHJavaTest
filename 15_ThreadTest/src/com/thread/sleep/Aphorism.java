package com.thread.sleep;

public class Aphorism implements Runnable {

	private String[] strArr;
	private int millis;
	
	
	public Aphorism(String[] strArr, int millis) {
		this.strArr = strArr;
		this.millis = millis;
		
	}

	@Override
	public void run() {
		
		for(int i = 0; i < strArr.length; i++) {
			int rnd = (int) (Math.random()*10);
			System.out.println(strArr[rnd]);
			
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "종료!");
	}

}
