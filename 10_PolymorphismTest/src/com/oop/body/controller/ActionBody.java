package com.oop.body.controller;

import java.awt.Desktop.Action;

import com.oop.body.model.*;

public class ActionBody {

	public static void main(String[] args) {
		ActionBody ab = new ActionBody();

		Body[] body = new Body[5];
		
		//랜덤으로 입력
		int rnd;
		for (int i = 0; i < body.length; i++) {
			rnd = (int) (Math.random() * 3) + 1;
			if (rnd == 1) {
				body[i] = new Head("빨간");
			} else if (rnd == 2) {
				body[i] = new Arm();
			} else if (rnd == 3) {
				body[i] = new Leg();
			}
		}
		
//		body[0] = new Head("빨간");
//		body[1] = new Arm();
//		body[2] = new Leg();
//		body[3] = new Head("파란");
//		body[4] = new Leg();

		// 동적바인딩으로 실행
		for (Body b : body)
			b.action();

		//메인메소드내 action 메소드 실행
//		for(Body b : body)
//			ab.action(b);
		
		
	}
	
	//Body 타입을 변수로 사용하는 action 메소드
	//instanceof로 타입변경하고 각 클래스의 메소드 실행
//	public void action(Body body) {
//		if(body instanceof Head)
//			((Head)body).headBang();
//		else if (body instanceof Arm)
//			((Arm)body).armSwing();
//		else if (body instanceof Leg)
//			((Leg)body).run();
//	}
}
