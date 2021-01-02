package com.io.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyNote {
	
	Scanner sc = new Scanner(System.in);

	public MyNote() {
		super();
		
	}
	
	public void fileSave() {
		
		System.out.println("파일에 저장할 내용을 입력하시오.");
		//스트링빌더 입력
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			System.out.print("입력 내용 : ");
			//문자 입력
			String str = sc.nextLine();
			//exit 입력 시 
			if (str.equals("exit")) {
				System.out.println("저장하시겠습니까? (y/n)");
				char ch = sc.next().charAt(0);
				//y입력시 출력될 내용
				if (ch == 'y') {
					//파일명 입력
					System.out.print("저장할 파일명 : ");
					String fileName = sc.next();
					File f = new File(fileName);
					//입력받은 파일명에 스트링빌더 저장 //괄호안에 작성 시 bw.close 작성 불필요
					try (BufferedWriter bw = new BufferedWriter(new FileWriter(f));){
						
						bw.write(sb.toString() + "\n");
						System.out.println(fileName + "에 성공적으로 저장하였습니다.");
						//문자 날림
						sc.nextLine();
						bw.flush();
						
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else if (ch == 'n') {
					break;
				}
				break;
			}
			//입력한 문자열 스트링빌더에 저장
			sb.append(str);
			//스트링빌더 확인
			System.out.println(sb.toString());
			
		}
		
	}

	public void fileOpen() {
		
		System.out.print("열기할 파일명 : ");
		String fileName = sc.next();
		File f = new File(fileName);
		try (BufferedReader br = new BufferedReader(new FileReader(f));){

			String data = null;
			System.out.println(fileName + "을 성공적으로 불러왔습니다.");
			while ((data = br.readLine()) != null) {

				System.out.println(data);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void fileAppend() {
		
		System.out.print("수정할 파일명 : ");
		String fileName = sc.next();
		File f = new File(fileName);
				
		try (BufferedReader br = new BufferedReader(new FileReader(f));){
			
			String data = null;
			System.out.println(fileName + "을 성공적으로 불러왔습니다.");
			while ((data = br.readLine()) != null) {
				
				System.out.println(data);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일에 추가할 내용을 입력하시오.");
		// 스트링빌더 입력
		StringBuilder sb = new StringBuilder();
		//문자 날림
		sc.nextLine();
		
		while (true) {
			System.out.print("입력 내용 : ");
			// 문자 입력
			String str = sc.nextLine();
			// exit 입력 시
			if (str.equals("exit")) {
				System.out.println("저장하시겠습니까? (y/n)");
				char ch = sc.next().charAt(0);
				// y입력시 출력될 내용
				if (ch == 'y') {

					// 입력받은 파일명에 스트링빌더 저장
					try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));){
					
						bw.write(sb.toString() + "\n");
						System.out.println(fileName + "파일의 내용이 변경되었습니다.");

						bw.flush();
						
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
				break;
			}
			// 입력한 문자열 스트링빌더에 저장
			sb.append(str);
			// 스트링빌더 확인
			System.out.println(sb.toString());
		}

	}
}
