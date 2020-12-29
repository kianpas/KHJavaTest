package com.oop.body.model;

public class Leg extends Body{
	
	@Override
	public void action() {
		run();
	}

	public void run() {
		System.out.println("성큼성큼 뛰어갑니다.");
	}
}
