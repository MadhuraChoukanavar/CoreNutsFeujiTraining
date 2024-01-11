package com.cnstf.secondweek17_11_23_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//5.write a program to handle multiple or specific exceptions using different catch blocks
public class MultipleExceptionsUsingDiffCatch {
	public static void main(String[] args) {
		int number=0;
		String name=null;
		//here only 1st line will execute in try block after that lines wont execute 
		//the use of using multiple catch block is when we don't have
		try {
			System.out.println(name.charAt(number));
			System.out.println(10/number);
			FileInputStream file=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\exports");
			
		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		System.out.println("hiii file not found exception");
			
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
			System.out.println("hiii  arithmetic  exception");
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
			System.out.println("hiii  exception");
		}
		
	}

}
