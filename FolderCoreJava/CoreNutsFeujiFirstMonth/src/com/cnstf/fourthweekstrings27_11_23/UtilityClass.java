package com.cnstf.fourthweekstrings27_11_23;
//1. Write a program by utilizing all utility functions of wrapper classes and show the
//difference from one class function to another class function







public class UtilityClass {

	public static void main(String[] args) {
		Integer integer=new Integer(100);
		//it will print the value inside the String
		int i=Integer.parseInt("100");
		System.out.println(i);
		//it will return integer instance
		
		System.out.println(Integer.valueOf(i));
		//return int value to byte
		integer.byteValue();
		int hashCode = integer.hashCode();
		System.out.println(hashCode);
		
		String string = Integer.toString(i);
		System.out.println(string);
		
	}

}
