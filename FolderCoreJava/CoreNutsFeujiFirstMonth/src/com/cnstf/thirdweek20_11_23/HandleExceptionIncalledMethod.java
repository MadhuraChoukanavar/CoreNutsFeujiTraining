package com.cnstf.thirdweek20_11_23;
//6.write a program to handle exception by caller method instead of execution method
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandleExceptionIncalledMethod {
	public static void main(String[] args) {
		HandleExceptionIncalledMethod handle=new HandleExceptionIncalledMethod();
		handle.callingMethod();
		
	}
	public void callingMethod()
	{
		HandleExceptionIncalledMethod handle=new HandleExceptionIncalledMethod();
		try {
			handle.findFile();
		} catch (FileNotFoundException e) {
			
		System.out.println("it will throw exception "+e.getMessage());
		}
	
	}
	public void findFile() throws FileNotFoundException
	{
		FileInputStream file =new FileInputStream("asdfgh");
	}
	
	

}
