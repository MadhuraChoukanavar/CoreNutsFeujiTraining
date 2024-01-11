package com.cnstf.firstweek_assignment;

public class Fibonacci {
	public static void main(String[] args) {
		int firstNum=1;
		int secondNum=1;
		int[] arrayOfFib=new int[20];
		float sum=0f;
		for(int number=0;number<20;number++)
		{
			System.out.println(firstNum);
			arrayOfFib[number]=firstNum;

			int sumOfNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sumOfNum;
			
		}
		for(int index=0;index<20;index++)
		{
			sum=sum+arrayOfFib[index];
		}
		System.out.println(sum/20);
		
	}

}
