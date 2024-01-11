package com.cnstf.fourthweekList30_11_23;

import java.util.Arrays;
import java.util.List;

// 3.Write a program to print a collection?
public class PrintCollenction {
	public static void main(String[] args) {
		List<Integer> listOfStrings=Arrays.asList(1,2,3,6,8);
		PrintCollenction printclo=new PrintCollenction();
		printclo.printCollection(listOfStrings);
		 
	}
	

	public void printCollection(List<Integer> list)
	{
		for(Integer integer:list)
		{
			System.out.println(integer);
		}
	}
}
