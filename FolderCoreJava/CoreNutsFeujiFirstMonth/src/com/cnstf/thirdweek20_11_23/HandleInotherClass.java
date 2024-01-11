package com.cnstf.thirdweek20_11_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//7.write a program to handle exception by caller class
public class HandleInotherClass {

	public void ThrowException() throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream("bsiuh");
		
	}

}
