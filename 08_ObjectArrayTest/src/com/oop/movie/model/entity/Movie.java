package com.oop.movie.model.entity;

import java.util.Calendar;

/**
 * 
 * @실습문제1 : 영화클래스 만들기
 *	
- 클래스명 : com.oop.movie.model.entity.Movie.java
- 멤버변수 : 반드시 캡슐화를 적용할 것
    - movieTitle : String                   //영화제목
    - director : String                     //감독이름
    - casting : String[]                    //출연배우 최대5명까지
    - release : Calendar                    //개봉일
- 각 멤버변수별 getter, setter
- 영화정보를 담은 information():String
- 파라미터 생성자.
    1. movieTitle
    2. movieTitle, director
    3. movieTitle, director, casting
    4. movieTitle, director, casting, release
생성자간 생성자호출 this()를 활용할 것.
영화4편을 각각의 생성자를 통해 생성한 후에 출력한다.

 */
public class Movie {
	
	private String movieTitle;
	private String director;
	private String[] casting = new String[5];
	private Calendar release;
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String[] getCasting() {
		return casting;
	}
	public void setCasting(String[] casting) {
		this.casting = casting;
	}
	public Calendar getRelease() {
		return release;
	}
	public void setRelease(Calendar release) {
		this.release = release;
	}
	public Movie() {

	}

	public Movie(String movieTitle, String director, String[] casting, Calendar release) {

		this(movieTitle, director, casting);
		//this.movieTitle = movieTitle;
		//this.director = director;
		//this.casting = casting;
		this.release = release;
	}
	
	
	public Movie(String movieTitle) {

		this.movieTitle = movieTitle;
		

	}

	public Movie(String movieTitle, String director) {
		
		this.movieTitle = movieTitle;
		this.director = director;

	}

	public Movie(String movieTitle, String director, String[] casting) {

		this.movieTitle = movieTitle;
		this.director = director;
		this.casting = casting;

	}
	
	public String information() {
		
		String info = "";
		Calendar cal = Calendar.getInstance();
		
		if(movieTitle != null) {
			info += "영화제목 : " + movieTitle;
		}
		
		if(director != null) {
			info += "\n감독 : " + director;
		}
		
		if (casting[0] != null) {
			info += "\n출연배우 : ";

			for (int i = 0; i < casting.length; i++) {
				if (casting[i] == casting[4]) {
					info += casting[i];
				} else {
					info += casting[i] + ", ";
				}
			}
		}
		
		if (release != null)
			//날짜 읽는 부분
			info += "\n개봉일 : " + release.get(Calendar.YEAR) + "년  " + release.get(Calendar.MONTH) + "월 "
					+ release.get(Calendar.DATE) + "일";

		System.out.println();
		return info;

	}
}
