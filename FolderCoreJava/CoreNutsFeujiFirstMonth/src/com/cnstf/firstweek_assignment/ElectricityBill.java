package com.cnstf.firstweek_assignment;

import java.util.Scanner;

public class ElectricityBill {

	String calculateBill(int units)
	{
		if(units<= 50)
		{
			return "Minimum Usage and bill is 250rs";
		}
		else if(units>50 && units <=100)
		{
			int bill = (units*5);
			return "Moderate Usage and bill is"+bill+"rs";
		}
		else {
			int bill = (units*8);
			return "High Usage and bill is"+bill+"rs";
		}
	}
	public static void main(String[] args) {
		ElectricityBill electricityBill8 = new ElectricityBill();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Units:");
		int units = sc.nextInt();
		System.out.println(electricityBill8.calculateBill(units));
	}
}

