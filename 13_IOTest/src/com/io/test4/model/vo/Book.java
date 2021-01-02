package com.io.test4.model.vo;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable {

	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discountRate;

	public Book() {
		super();

	}

	public Book(String titel, String author, int price, Calendar date, double discountRate) {

		this.title = titel;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discountRate = discountRate;
	}

	public String getTitel() {
		return title;
	}

	public void setTitel(String titel) {
		this.title = titel;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String toString() {
		String redate = "도서명 : " + title + " 저자 : " + author + " 가격 : " + price 
						+ " 출판 날짜 : " + date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH) 
						+ "월 " + date.get(Calendar.DATE) + "일 출간" + " 할인율 : " + discountRate + "%";
		return redate;
	}
}
