package com.cntsf.firstweek6_11_23;

import java.util.Scanner;
//This class is used to print the multiplication tables
public class MultiplecationTables {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the numbers");
		int number1 = scn.nextInt();
		int number2 = scn.nextInt();
		int multiplyTill=scn.nextInt();
		if(number1>1000||number2>1000)
		{
			System.out.println("please enter valid number below 1000");
		}
		else
		{
		for (int number = number1; number <= number2; number++) {
			System.out.println(number + "table");
			for (int multipleBy = 1; multipleBy <= multiplyTill; multipleBy++) {

				System.out.println(number + " * " + multipleBy + " = " + number * multipleBy);
 
			}
			System.out.println("-------------------------------");
		}
	}
		
	}
}
