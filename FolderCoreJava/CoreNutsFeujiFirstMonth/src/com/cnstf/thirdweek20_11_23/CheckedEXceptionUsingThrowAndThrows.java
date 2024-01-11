package com.cnstf.thirdweek20_11_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//1.write a program to throw checked exception using throw and throw
public class CheckedEXceptionUsingThrowAndThrows {
	
	public static void main(String[] args)  {
		CheckedEXceptionUsingThrowAndThrows excp=new CheckedEXceptionUsingThrowAndThrows();
		try
		{
		excp.FindTheFile();
		}
		catch (Exception e) {
			System.out.println( "perticular file is not found in the given path");
		}
		
		}
	public void FindTheFile() throws FileNotFoundException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\Autodesk Application Manager1");
		throw new FileNotFoundException();
	}
}
