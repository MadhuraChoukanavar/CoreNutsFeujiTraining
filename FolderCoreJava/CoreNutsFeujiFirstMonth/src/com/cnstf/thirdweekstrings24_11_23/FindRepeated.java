package com.cnstf.thirdweekstrings24_11_23;
//11. Write a program to count repeated characters in a string.
public class FindRepeated {
public static void main(String[] args) {
	String str="madhuramadhura";

	while(str.length()>0)
	{
		char c=str.charAt(0);
		String s2="";
		s2=str.replace(c+"" ,"");
		int count=str.length()-s2.length();
		System.out.println(str.charAt(0)+"="+count);
		str=s2;
	}
}
}
