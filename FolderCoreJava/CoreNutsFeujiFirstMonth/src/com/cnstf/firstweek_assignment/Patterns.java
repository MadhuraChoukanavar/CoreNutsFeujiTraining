package com.cnstf.firstweek_assignment;

public class Patterns {
	public static void main(String[] args) {
		int number=0;
		Patterns pattern=new Patterns();
		System.out.println("pattern 1");
		pattern.pattern1(number=5);
		System.out.println();
		System.out.println("pattern 2");
		pattern.pattern2(number=5);
		System.out.println();
		System.out.println("pattern 3");
		pattern.pattern3(number=7);
		System.out.println();
		System.out.println("pattern 4");
		pattern.pattern4(number=8);
		
		System.out.println();
		System.out.println("pattern 5");
		pattern.pattern5("corenuts");
		
		System.out.println();
		System.out.println("pattern 6");
		pattern.pattern6(1,9);
		
	}
	public void pattern1(int number)
	{
		for(int row=1;row<=number;row++)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(column);
			}
			System.out.println();
		}
	}
	
	public void pattern2(int number)
	{
		for(int row=1;row<=number;row++)
		{
			for(int column=1;column<=number;column++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public void pattern3(int number)
	{
		for(int row=1;row<=number;row++)
		{
			for(int column=1;column<=number;column++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public void pattern4(int number)
	{
		for(int row=1;row<=number;row++)
		{
			if(row<number/2) {
			for(int column=1;column<=(number+4)-(row*2);column++)
			{
				System.out.print("*");
			}
			}
			else
			{
				int i=0;
				for(int column=1;column<=number/2-(1*i);column++)
				{
					System.out.print("*");
					
				}i++;
				
			}
			System.out.println();
		}
	}
	public void pattern5(String name )
	{
		for(int row=1;row<=name.length();row++)
		{
			for(int index=0;index<row;index++ ) {
				System.out.print(name.charAt(index));
				
			}
			System.out.println();
		}
	}
	public void pattern6(int number1,int number2)
	{
		for(int row=number1;row<=number2;row++)
		{
			for(int column=1;column<=number2;column++)
			{
			System.out.print(row*column+"   ");
			}
			System.out.println();
		}
	}
}
