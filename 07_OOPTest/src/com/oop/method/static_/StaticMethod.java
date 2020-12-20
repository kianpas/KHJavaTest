package com.oop.method.static_;

/**
 *  //static method
    //1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
    //메소드명 : toUpper(String) : String
    
    
    //2. 첫번째 문자열의 전달받은 인덱스의 문자를 전달받은 문자로 변경하는 static 메소드
    //메소드명 : setChar(String, int, char)
    
    //3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
    //메소드명 : getAlphabetLength(String) : int
    
    
    //4. 전달한 문자열값을 하나로 합쳐서 리턴 
    //메소드명 : concat(String, String) : String

 * 
 *
 */
public class StaticMethod {
	
	public static String toUpper(String str) {
		
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				index++;
		}

		if (index != 0) {
			str = str.toUpperCase();
			return str;
		} else
			// System.out.println("잘못된 입력");
			return null;
		
	}
	
	public static void setChar(String str, int num, char ch) {

		char charr[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			charr[i] = str.charAt(i);
		}

		for (int i = 0; i < str.length(); i++) {
			if (charr[i] == charr[num-1]) {
				charr[num-1] = ch;
			}
			System.out.print(charr[i]);
		}

	}
	
	public static int getAlphabetLength(String str) {
		
//		char charr[] = new char[str.length()];
//
//		for (int i = 0; i < str.length(); i++) {
//			charr[i] = str.charAt(i);
//		}
		
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123)) {
				cnt++;
			}
		}
		return cnt;

	}
	
	public static String concat(String str1, String str2) {
			
		return str1 + str2 ;
		
	}
	
}	
