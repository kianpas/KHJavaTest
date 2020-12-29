package com.oop.body.model;

public class Arm extends Body{
	
	public Arm() {
		
	}
	@Override
	public void action() {
		armSwing();
	}
	
	
	public void armSwing() {
		System.out.println("팔을 뻗습니다.");
	}
}
