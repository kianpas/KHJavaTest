package com.collection.map.student;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;


public class StudentProperties {

	public static void main(String[] args) {
		StudentProperties sp = new StudentProperties();
		sp.readFile();
		sp.printConsole(sp.readFile());
		sp.saveXMLFile(sp.readFile());
		
		
	}
	
	public List<Student> readFile() {
		Student s = new Student();
		Properties prop = new Properties();

		try {
			prop.load(new FileReader("score.txt"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		
//		HashMap<String, String> map = new HashMap<String, String>();
//		Set<Map.Entry<String, String>> set = map.entrySet();
//		for (Map.Entry<String, String> m : set) {
//			System.out.println(m.getKey());
//			System.out.println(m.getValue());
//		}
		
		List<Student> list = new ArrayList<Student>();
		String value = null;
		Enumeration<?> en = prop.propertyNames();
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();// 형변환 강요 //키값만 가져온 것
			value = prop.getProperty(name);
			// System.out.println(name + " " + value);

			String[] str = value.split(",");

			list.add(new Student(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]),
					Integer.parseInt(str[4])));

			// System.out.println(list);

		}

		return list;
	}
	
	public void printConsole(List<Student> stdtList) {
		
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		for (Student st : stdtList) {
			System.out.println(st);
			korSum += st.getKor();
			engSum += st.getEng();
			mathSum += st.getMath();
		}

		System.out.println("국어 합계 : " + korSum);
		System.out.println("영어 합계 : " + engSum);
		System.out.println("수학 합계 : " + mathSum);

		System.out.println("국어 평균  : " + korSum / 5);
		System.out.println("국어 평균  : " + engSum / 5);
		System.out.println("국어 평균  : " + mathSum / 5);

	}
	
	public void saveXMLFile(List <Student> stdtList) {
		
		Properties prop = new Properties();
		//for each문으로 저장
		for(Student s : stdtList) {
			String kk = String.valueOf(s.getSno());
			String info = s.getSno() + "," + s.getSname() + "," + s.getKor() + "," + s.getEng() + "," + s.getMath();
			prop.setProperty(kk, info);
		}
		
		//iterator로 저장
		Iterator<Student> iter = stdtList.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			String key = Integer.toString(s.getSno());
			prop.setProperty(key, s.toString());
				
		}
		System.out.println(prop);
		
		//파일에 저장, 설정 저장
		
		//.xml 
		try {//파일에 저장하고 주석단것
			//바이트형만 가능
			prop.storeToXML(new FileOutputStream("student.xml"), "student.xml");
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
}
