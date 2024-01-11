package com.cnstf.firstweek_assignment;

import java.util.Scanner;

public class MarksOfFiveSubjects {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the marks");
		MarksOfFiveSubjects maxMinAvg =new MarksOfFiveSubjects();
		int [] marksIntSubjects=new int[5];
		for(int index=0;index<marksIntSubjects.length;index++)
		{
			marksIntSubjects[index]=scn.nextInt();
		}
		System.out.println(maxMinAvg.MaxValue(marksIntSubjects));
		System.out.println(maxMinAvg.MinValue(marksIntSubjects));
		System.out.println(maxMinAvg.avgValue(marksIntSubjects));
	}
	public int MaxValue(int[] intArray)
	{
		int index=0;
		int maxVal=intArray[index];
	
		while(index<intArray.length)
		{
			if(intArray[index++]>maxVal)
			{
				maxVal=intArray[index];
			}
		}
		return maxVal;
		
	}
	public int MinValue(int[] intArray)
	{
		int index=0;
		int minVal=intArray[index];
		
		while(index<intArray.length)
		{
			if(intArray[index++]<minVal)
			{
				minVal=intArray[index];
			}
		}
		return minVal;
		
		
	}
	public int avgValue(int[] intArray)
	{
		int index=0;
		int avgValue=0;
		
		while(index<intArray.length)
		{
			avgValue=avgValue+intArray[index];
			index++;
			
			
		}
		return avgValue/intArray.length;
		
		
	}



}
