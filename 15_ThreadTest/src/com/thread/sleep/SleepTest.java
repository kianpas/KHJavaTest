package com.thread.sleep;

public class SleepTest {

	public static void main(String[] args) {
		
		SleepTest st = new SleepTest();
		st.sendAphorism();
		
	}

	public void sendAphorism() {
		
		String[] strArr = {"개같이 벌어서 정승같이 쓴다", "개 눈에는 똥만 보인다", "개는 잘 짖는 다고 좋은 개가 아니다", "개도 닷새만 되면 주인을 안다", 
							"개미 구멍이 둑을 무너뜨릴 수도 있다", "고슴도치에 놀란 호랑이 밤송이 보고 절한다", "고양이가 발톱을 감춘다", 
							"고양이 목에 방울 단다", "고양이 죽은데 쥐 눈물만큼", "돼지 발톱에 봉숭아 들이기"};
		
		Thread th = new Thread(new Aphorism(strArr, 300));

		th.setName("속담");
		
		th.start();

	}

	
}
