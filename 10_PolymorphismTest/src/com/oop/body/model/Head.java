package com.oop.body.model;

public class Head extends Body{
	
	private String hairColor;

	public Head() {

	}
	
	public Head(String hairColor) {
		
		this.hairColor = hairColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	@Override
	public void action() {
		headBang();
	}
	
	public void headBang() {
		System.out.println(hairColor + "색 머리를 돌립니다.");
	}

}
