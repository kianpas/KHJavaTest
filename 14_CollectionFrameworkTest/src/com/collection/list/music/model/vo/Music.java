package com.collection.list.music.model.vo;

public class Music {
	
	private String title;
	private String singer;

	public Music() {
		super();

	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "[title=" + title + ", singer=" + singer + "]" + "\n";
	}
	
	@Override
	public boolean equals(Object o) {

		// student 형변환전 타입검사
		if (!(o instanceof Music))
			return false;

		Music other = (Music) o;

		if (!title.equals(other.title))
			return false;

		if (!singer.equals(other.singer))
			return false;

		return true;
	}

	

//	@Override
//	public int compareTo(Music other) {
//		return this.title - other.title;
//	}
}
