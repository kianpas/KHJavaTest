package com.oop.method;

/**
 * 
 * [필드실습문제]
@com.oop.method.Test
다음 코드에서 각 출력문에 찍히게 될 값을 작성하고, 실제 코드로 작성후 확인하세요.
        public class Test {
            int a = 100;
            static int s = 99;
            
            //뉴 할때마다 힙에 새로운 영역 만들어짐다
            public static void main(String[] args) {
                Test t = new Test();
                t.test1();
                               
                t.test2();
                //1000
                
                
                Test t3 = new Test();
                t.test3(t3);
                
                
                System.out.println(t3.a);//100
                
                
                t.test4(t);
                    
            }
            public void test1() {
                int a = 1000;
                int s = 999;
                System.out.println(this.a);// 1000
                System.out.println(Test.s);//99
            }
            public void test2() {
                Test t = new Test();
                t.a = 1000;
                System.out.println(a);//1000
            }
            public void test3(Test t) {
                t.a = 10;
                this.a = 200;
                System.out.println(t.a);//10
            }
            public void test4(Test t) {
                t.a = 1000;
                System.out.println(this.a);//100
            }
        }

 *
 */
public class Test {

	  int a = 100;
      static int s = 99;
      
	public static void main(String[] args) {
		
		Test t = new Test();
		t.test1(); //변수값 없으모로
		t.test2();
		
		Test t3 = new Test();
		t.test3(t3);
		
		System.out.println(t3.a);//t3에서 a를 지정해서
		System.out.println();
        
        t.test4(t);
		
	}
	
	  public void test1() {
          int a = 1000;
          int s = 999;
          System.out.println(this.a);// 100 //this는 호출한 t의 a를 의미
          System.out.println(Test.s);//99 //Test클래스의 s
          System.out.println(a); // 그냥 a, s만 했을 경우 1000, 999
          System.out.println(s);
          System.out.println();
      }
	  
	  public void test2() {
          Test t = new Test();
          t.a = 1000;
          System.out.println(a);//100
          System.out.println(t.a);//1000
          System.out.println();
      }
	  
	  public void test3(Test t) { //매개변수가 있어서 값이 달라짐
          t.a = 10;
          this.a = 200;
          System.out.println(t.a);//10 //t3로 새로운 객체 생성해서
          System.out.println(a); //200
          System.out.println();
      }
	  
	   public void test4(Test t) {
           t.a = 1000;
           System.out.println(this.a);//1000
       }
}
