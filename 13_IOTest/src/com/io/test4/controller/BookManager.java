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

		try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {

			Book b1 = new Book("소설책", "지은이1", 10000, new GregorianCalendar(2015, 1, 12), 0.1);
			Book b2 = new Book("교과서", "지은이2", 12000, new GregorianCalendar(2018, 3, 10), 0.15);
			Book b3 = new Book("사회책", "지은이3", 14000, new GregorianCalendar(2020, 5, 17), 0.2);
			Book b4 = new Book("역사책", "지은이4", 16000, new GregorianCalendar(2021, 10, 10), 0.25);
			Book b5 = new Book("동화책", "지은이5", 18000, new GregorianCalendar(2012, 6, 2), 0.3);

			oos.writeObject(b1);
			oos.writeObject(b2);
			oos.writeObject(b3);
			oos.writeObject(b4);
			oos.writeObject(b5);

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

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}
}	
	
