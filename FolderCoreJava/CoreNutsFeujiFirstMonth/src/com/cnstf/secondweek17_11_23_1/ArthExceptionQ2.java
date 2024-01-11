package com.cnstf.secondweek17_11_23_1;
//2.write a program to raise arithmetic exceptions
public class ArthExceptionQ2 {
	public static void main(String[] args) {
		int num=0;
		//line 7 throw arithmetic exception 
		try {

			System.out.println(10/num);
		} 
		catch (ArithmeticException e) {
			System.out.println("exception is :"+e.getMessage());
		}
		
	}

}
