package com.cnstf.fourthweekList30_11_23;

import java.util.Arrays;
import java.util.List;

//1. Write a program to convert an array to collection?
public class ArrayToCollection {
	public static void main(String[] args) {
		String[] arrayOfString= {"madhura","sahana","aparna","savita"};	
		List<String> asList = Arrays.asList( arrayOfString);
		
		for(String string:asList)
		{
			System.out.print(string+",");
		}
		System.out.println();
        Integer [] arrayOfInteger= {1,2,3,4,5,6};
          List<Integer> asList2 = Arrays.asList(arrayOfInteger);
        
          
          int [] arrayOfInt= {1,2,3,4,5,6};
          List<int[]> asList3 = Arrays.asList(arrayOfInt);
          for(int [] intarray:asList3)
          {
        	  for(int integer:intarray)
              {
        		  System.out.print(integer);
              }
          }

	}

}
