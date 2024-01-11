package com.cnstf.secondweek15_11_23_1;

public class Test extends SuperClass{
    public int doIt(String str, Integer... data){
          String signature = "(String, Integer[])";
          System.out.println("Overridden: " + str + " " +signature);
          return 0;
    }

    public static void main(String... args){
          SuperClass sb = new Test();
      //    sb.doIt("hello", 3);
    }
}    

//class A{
//	static void method(){
//		System.out.println("Class A method");
//	}
//}
//class B extends A{
//	static void method(){
//		System.out.println("Class B method");
//	}
//}
//
//	class Base{
//		int value = 0;
//	        Base(){
//	        	addValue();
//	        }
//	        void addValue(){
//	        	value += 10;
//	        }
//	        int getValue(){
//	        	return value;
//	        }
//	}
//	class Derived extends Base{
//		Derived(){
//			addValue();
//		}
//		void addValue(){
//			value +=  20;
//		}
//	}
  

class SuperClass{
    public int doIt(String str, Integer... data)throws Exception{
          String signature = "(String, Integer[])";
          System.out.println(str + " " + signature);
          return 1;
    }
}
