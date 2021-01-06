package com.collection.map.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("resources/config.properties"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//요소 가져오기
		String os = prop.getProperty("OS");
		String price = prop.getProperty("Price");
		String company = prop.getProperty("Company");
		String primaryui = prop.getProperty("PrimaryUI");
		System.out.println(os);
		System.out.println(price);
		System.out.println(company);
		System.out.println(primaryui);
		
		//전체 열람 사용
		Enumeration<?> en = prop.propertyNames();
		
		while(en.hasMoreElements()) {
			String name = (String) en.nextElement();
			String value = prop.getProperty(name);
			System.out.println(name + " = " + value);
		}
	}

}
