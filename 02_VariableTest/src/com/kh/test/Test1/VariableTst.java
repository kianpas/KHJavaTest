package com.kh.test.Test1;

public class VariableTst {

	public static void main(String[] args) {
		
		int inum = 100;
		long lngnum = 999999999999l;
		float flt = 486.52f;
		double dbl = 567.890123;
		char a = 'A';
		String str = "Hello world";
		boolean boo = true;
		
		System.out.println(inum);
		System.out.println(lngnum);
		System.out.println(flt);
		System.out.println(dbl);
		System.out.println(a);
		System.out.println(str);
		System.out.println(boo);
		System.out.println();
		
		VariableTst vtst = new VariableTst();
		vtst.test2();
	}
		
		 public void test2(){
	            System.out.println("A = "+ ('A'+0));   
	            //char + int > int + int //65
	            System.out.println("0 = " + ('0' + 0) );  
	            //char + int > int + int //48
	            System.out.println("(char)65 = " + (char)65); 
	            //int > char //A
	            
	            byte bt1 = 125;
	            char ch1 = 'C';
	            int it1 = bt1 - ch1;  
	            System.out.println("it1 = "+it1);  
	            //byte - char > int - int  // 123-67 = 58
	            	            
	            boolean bool = false;
	            
	            bool = (2.0 == 5/2);
	            System.out.println("bool = " + bool);
	            //double == int / int > double == double > // true
	            bool = ('C' == 67);
	            System.out.println("bool = " + bool);
	            //char == int > int == int // true
	            bool = ('A' == 'B'-1);
	            System.out.println("bool = " + bool);
	            //char == char - int > char == int -int > char == int > int == int  //true
	            bool = ('a' != 97 );//부정연산자
	            System.out.println("bool = " + bool);
	            //char != int > int != int //false 
	        }

	}


