package com.collection.list.music.view;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.controller.MusicManager;
import com.collection.list.music.model.vo.Music;
import com.collection.list.music.model.vo.SingerNameAscending;
import com.collection.list.music.model.vo.SingerNameDsecending;
import com.collection.list.music.model.vo.TitleNameAscending;
import com.collection.list.music.model.vo.TitleNameDsecending;

public class MusicMenu {
	
	private MusicManager manager = new MusicManager();
	private Scanner sc = new Scanner(System.in);
		
	public void mainMenu() {
	
		int num;
		
		String menu = "================ Music Playlist Menu ================\r\n" + 
				"1.목록보기\r\n" + 
				"2.마지막에 음악추가\r\n" + 
				"3.맨처음에 음악추가\r\n" + 
				"4.곡삭제\r\n" + 
				"5.곡변경\r\n" + 
				"6.곡명검색\r\n" + 
				"7.가수검색\r\n" + 
				"8.목록정렬(곡명오름차순)\r\n" + 
				"0.종료\r\n" + 
				"=====================================================\r\n" + 
				">> 메뉴선택 : ";
		
		
		do {

			System.out.print(menu);
			num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				printList(manager.selectList());
				break;
			case 2:
				manager.addList(inputMusic());
				break;
			case 3:
				manager.addAtZero(inputMusic());
				break;
			case 4:
				manager.removeMusic(inputTitle());
				break;
			case 5:
				manager.replaceMusic(inputMusic(), inputMusic());
				break;
			case 6:
				System.out.println(manager.searchMusicByTitle(inputTitle()));
				break;
			case 7:
				System.out.println(manager.searchMusicBySinger(inputSinger()));
				break;
			case 8:
				sortMenu();
				break;
			}

		} while (num != 0);

	}

	
	public void sortMenu() {
		
		int num;
		
		String menu = "================== 정렬 메뉴 ===================\r\n" + 
				"1. 가수명 오름차순\r\n" + 
				"2. 가수명 내림차순\r\n" + 
				"3. 곡명 오름차순\r\n" + 
				"4. 곡명 내림차순\r\n" + 
				"5. 메인메뉴 돌아가기\r\n" + 
				"=============================================\n" + 
				">> 메뉴선택 : ";
		
		while (true) {

			System.out.print(menu);
			num = sc.nextInt();

			switch (num) {
			case 1:
				//오름차순은 기본이기 때문에 null 처리 해도 작동해야 하는데 안됨
				printList(manager.orderBy(new TitleNameAscending()));
				break;
			case 2:
				printList(manager.orderBy(new TitleNameDsecending()));
				break;
			case 3:
				printList(manager.orderBy(new SingerNameAscending()));
				break;
			case 4:
				printList(manager.orderBy(new SingerNameDsecending()));
				break;
			case 5: 
				mainMenu();
				return;
			}

		}

	}
	//a. 리스트 출력메소드
	public void printList(List<Music> list) {
		System.out.println(list);
				
	}
	//b. 곡명 입력메소드
	public String inputTitle() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		return title;

	}
	//c. 가수 입력메소드
	public String inputSinger() {
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		return singer;

	}
	//d. 음악 입력메소드(곡명, 가수 모두 입력)
	public Music inputMusic() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		
		return new Music(title, singer);

	}
	
	
}
