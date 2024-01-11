package com.cnstf.firstweek_assignment;

public class PrimeUsingWhileLoop {
	public static void main(String[] args) {
		int number1=1;
		int number2=100;
		while (number1<=number2)
		{
			int divide=2;
			boolean flag=true;
			while(divide<=number1/2)
			{
				
				if(number1%divide==0)
				{
					flag =false;
					break;
				}
				
				divide++;
			}
			if(flag)
			{
				System.out.println(number1);
			}
			number1++;
			
		}
	}

}
