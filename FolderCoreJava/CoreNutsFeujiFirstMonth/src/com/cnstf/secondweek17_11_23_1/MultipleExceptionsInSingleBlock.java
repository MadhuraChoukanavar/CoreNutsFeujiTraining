package com.cnstf.secondweek17_11_23_1;

import java.io.FileInputStream;
//6.write program to handle multiple exceptio in a single catch block
import java.io.FileNotFoundException;

public class MultipleExceptionsInSingleBlock {
	public static void main(String[] args) {
		int number=0;
		String name=null;
		//here we are handling multiple exception in single block
		try {
			System.out.println(name.charAt(number));
			System.out.println(10/number);
			FileInputStream file=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\exports");
			
		} catch (NullPointerException|ArithmeticException|FileNotFoundException e) {
		System.out.println(e.getMessage());
	
			
		}
	
	}

}
