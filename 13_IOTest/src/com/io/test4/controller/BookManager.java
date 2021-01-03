package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);

	public BookManager() {
		super();
		
	}

	public void fileSave() {

		Book[] book = new Book[5];

		File file = new File("book/books.dat");
		// 객체 스트림생성
		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			// 객체 배열에 저장
			
			//반복 입력	
			for (int i = 0; i < book.length; i++) {
				System.out.print(i + 1 + ". 제목 입력 : ");
				String title = sc.nextLine();
				System.out.print(i + 1 + ". 작가 입력 : ");
				String author = sc.next();
				System.out.print(i + 1 + ". 가격 입력 : ");
				int price = sc.nextInt();
				System.out.print(i + 1 + ". 연도 입력 (ex:20210101) : ");

				// 20210123
				String releaseDate = sc.next();
				int year = Integer.parseInt(releaseDate.substring(0, 4));
				int month = Integer.parseInt(releaseDate.substring(4, 6));
				int date = Integer.parseInt(releaseDate.substring(6, 8));

				System.out.print(i + 1 + ". 할인률 입력 : ");
				double discount = sc.nextDouble();
				System.out.println();
				sc.nextLine();

				book[0] = new Book(title, author, price, new GregorianCalendar(year, month, date), discount);
			}
			
			//직접 입력
//			book[0] = new Book("소설책", "지은이1", 10000, new GregorianCalendar(2015, 1, 12), 0.1);
//			book[1] = new Book("교과서", "지은이2", 12000, new GregorianCalendar(2018, 3, 10), 0.15);
//			book[2] = new Book("사회책", "지은이3", 14000, new GregorianCalendar(2020, 5, 17), 0.2);
//			book[3] = new Book("역사책", "지은이4", 16000, new GregorianCalendar(2021, 10, 10), 0.25);
//			book[4] = new Book("동화책", "지은이5", 18000, new GregorianCalendar(2012, 6, 2), 0.3);
			
			//입력정보 쓰기
			for (int i = 0; i < book.length; i++) {
				oos.writeObject(book[i]);
			}
			
			System.out.println("book.dat에 저장 완료!");
			

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void fileRead() {
		
		Book[] book = new Book[10];

		File f = new File("book/books.dat");

		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)))) {

			while (true) {
				System.out.println(ois.readObject());

			}

		} catch (EOFException e) {
			System.out.println("books.dat 읽기 완료!");

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
