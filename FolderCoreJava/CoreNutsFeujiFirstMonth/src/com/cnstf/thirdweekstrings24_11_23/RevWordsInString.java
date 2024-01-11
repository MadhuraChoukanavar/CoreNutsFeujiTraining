package com.cnstf.thirdweekstrings24_11_23;

//6. Write a program to reverse words instead of characters ““CoreNuts Technologies Pvt ltd.”
public class RevWordsInString {

public static void main(String[] args) {
	 RevWordsInString rev=new RevWordsInString();
     
	String [] stringArray=rev.convertToStringArray("CoreNuts Technologies Pvt ltd.");
	String  finalString="";
	for(int index=0;index<stringArray.length;index++)
	{
		finalString =finalString+rev.rev(stringArray[index])+" ";
	}
	System.out.println(finalString);
	finalString="";
	for(int index=stringArray.length-1;index>=0;index--)
	{
		finalString=finalString+stringArray[index]+" ";
	}
	System.out.println(finalString);
}
 public int countSpace(String s)
 { 
	 int count=0;
	 for(int index=0;index<s.length();index++)
	 {
		 if(s.charAt(index)==' ') {
			 count++;
		 }
	 }
	 return count;
 }
 public String[] convertToStringArray(String str)
 {
	 RevWordsInString rev=new RevWordsInString();
		int size= rev.countSpace(str);
		String[] stringArray=new String[size];
		stringArray=str.split(" ");
		return stringArray;
 }
 public String  rev(String s)
 {
	 String s1="";
	 for(int index=s.length()-1;index>=0;index--)
	 {
		// System.out.println(s.charAt(index));
		 s1=s1+s.charAt(index);
	 }
	return s1;
	 
 }
}
