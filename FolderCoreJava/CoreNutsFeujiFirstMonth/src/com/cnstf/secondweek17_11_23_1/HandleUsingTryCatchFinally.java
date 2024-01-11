package com.cnstf.secondweek17_11_23_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//3.write a program to handle the exception in try catch and finally block
public class HandleUsingTryCatchFinally {
	public static void main(String[] args) {
		FileInputStream file = null;
		try {
			 file=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\exports");
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
				finally
				{
					
				}
			}
			
		}
	}
}
