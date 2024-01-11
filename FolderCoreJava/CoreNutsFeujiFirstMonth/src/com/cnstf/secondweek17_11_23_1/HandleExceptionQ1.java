package com.cnstf.secondweek17_11_23_1;
//1.write a program to handle exception using try and catch
public class HandleExceptionQ1{
	public static void main(String[] args) {
		String value;
		value=null;
		//line 7 witll throw nullpointerexception bcoz value is null and we are searching 
		try {

			System.out.println(value.charAt(0));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
