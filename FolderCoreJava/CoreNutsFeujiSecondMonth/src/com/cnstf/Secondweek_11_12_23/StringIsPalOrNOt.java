package com.cnstf.Secondweek_11_12_23;

import java.util.function.Predicate;

//4. Write a Java program to implement a lambda expression to check if a given String is a palindrome.
public class StringIsPalOrNOt {
	public static void main(String[] args) {
		Predicate<String> isPal=(string)->
		{
			char[] charArray=string.toCharArray();
			int i=0,j=string.length()-1;
			while(i<j)
			{
				if(charArray[i]!=charArray[j])
					{
					return false;
					}
				i++;
				j--;
			}
			return true;
		};
		System.out.println(isPal.test("madam"));
	}
}
