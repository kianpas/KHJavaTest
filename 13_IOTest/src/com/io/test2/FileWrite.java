package com.io.test2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter(sc.next());

		for (int i = 1; i < 11; i++) {
			String data = i + " 번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();
	}

}
	
