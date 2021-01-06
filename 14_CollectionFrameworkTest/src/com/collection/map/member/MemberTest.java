package com.collection.map.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MemberTest {

	Map<String, Member> map = new HashMap<>();
	{
		map.put("1", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
		map.put("2", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
		map.put("3", new Member("leess", "1234", "이순신", 43, "01012341234"));
		map.put("4", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
		map.put("5", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
	}
	
	public static void main(String[] args) {
		
		MemberTest mt = new MemberTest();
		mt.test1();
		mt.test2();
		mt.test3();
		mt.test4();
	}

	private void test4() {
		
		Set<String> keySet = map.keySet();
		
		//for문 에러남
//		for (String key : keySet) {
//			Member value = map.get(key);
//			if (value.getUserId().equals("sinsa"))
//				map.remove(key);
//		}
		//Iterator처리
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Member value = map.get(key);
			if (value.getUserId().equals("sinsa"))
				iter.remove();
		}

		System.out.println(map);
		
	}

	private void test3() {
		
		Set<String> keySet = map.keySet();

		for (String key : keySet) {
			Member value = map.get(key);
			if (value.getUserId().equals("yooon"))
				map.put(key, new Member("yooon", "5678", "윤동주", 27, "01034563456"));
		}
		//변경확인
		System.out.println(map);
	}

	private void test2() {
		
		System.out.println(isUserExist("jangbg"));
		System.out.println(isUserExist("sejong"));
		
	}

	private void test1() {
		
		System.out.println(map);
	}

	private boolean isUserExist(String userId) {
		
		Set<String> keySet = map.keySet();

		for (String key : keySet) {
			Member value = map.get(key);
			if (value.getUserId().equals(userId))
				return true;

		}
		return false;
		
		
	}
}
