package com.cnstf.secondweek17_11_23_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//9.having multiple try catch and finally block 
public class MultipleTryCatchFinally {
	public static void main(String[] args) {
		int num=0;
		try {
			System.out.println(10/num);
			
		} catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block will execute");
		}
		
		String name=null;
		try
		{
			System.out.println(name.charAt(num));
		}
		catch (NullPointerException e) {
		System.out.println(e.getMessage());
		}
		finally {
			FileInputStream file = null;
			System.out.println("finally for null pointer");
			try {
			 file =new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\exports");
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			finally {
				if(file!=null)
				{
					try {
						file.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
