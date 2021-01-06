package com.collection.list.music.controller;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import com.collection.list.music.model.vo.Music;


public class MusicManager {
		
	Music music = new Music();
	private List<Music> mList = new ArrayList<>();

	// 초기화 블럭으로 리스트 생성
	{
		mList.add(new Music("나제목1", "가수1"));
		mList.add(new Music("다제목2", "나수1"));
		mList.add(new Music("라제목3", "다수1"));
		mList.add(new Music("마제목4", "라수1"));
		mList.add(new Music("사제목5", "마수1"));

	}

	Scanner sc = new Scanner(System.in);

	// 1. 음악리스트 리턴
	public List<Music> selectList() {
		return mList;
		
	}
	
	//2. 마지막에 음악추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드. 
	public void addList(Music music) {
		mList.add(music);
	}
	
	//3. 맨처음에 음악추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
	public void addAtZero(Music music) {
		mList.add(0, music);
		
	}
	
	//4. 특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
	public boolean removeMusic(String str) {
		
		// music.getTitle();
		// mList.contains(str);

		// String s = (mList).getTitle().toString();
		
		//구식
		for (Music m : mList) {
			if (m.getTitle().equals(str)) {
				mList.remove(m);
				System.out.println(str + " 삭제");
				return true;
			} else {
				System.out.println("없음");
				return false;
			}
		}
		return false;
	}
	
	//5. 특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체)
	public boolean replaceMusic(Music oldMusic, Music newMusic) {

		int index = mList.indexOf(oldMusic);
		mList.add(index, newMusic);
		System.out.println(oldMusic + "을 " + newMusic + "으로  교체");

		return true;
	}

	//6. 특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음. 
	//잘못된 제네릭선언
	//public <Music> List  searchMusicByTitle(String title) {
	public List<Music> searchMusicByTitle(String title) {

		// 새로 리스트를 만드어서 하면됨
		List<Music> neList = new ArrayList<Music>();

		for (Music m : mList) {
			if (m.getTitle().equals(title)) {
				neList.add(m);
				System.out.println(title + "찾음");
			}
		}
		return neList;

	}
	
	//7. 가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
	public List<Music> searchMusicBySinger(String singer) {

		List<Music> neList = new ArrayList<Music>();

		for (Music m : mList) {
			if (m.getSinger().equals(singer)) {
				neList.add(m);
				System.out.println(singer + "찾음");
			}
		}

		return neList;
	}
	
	//8. 서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
	public List <Music> orderBy(Comparator<Music> c){
		
		List<Music> mList = (List<Music>)((ArrayList)this.mList).clone();
		mList.sort(c);
		return mList;
	}
}
