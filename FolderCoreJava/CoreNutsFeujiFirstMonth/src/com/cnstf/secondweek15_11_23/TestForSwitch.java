package com.cnstf.secondweek15_11_23;

import java.util.Scanner;
//we can use without break but it will print all lines till break
//we can use default anywhere no mandatory at last only
public class TestForSwitch {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scn.nextInt();
		switch (number) {
		case 0:
			System.out.println("sunday");
			System.out.println("sunday is holiday");
			break;
		
		case 2:
			System.out.println("teusday");
			System.out.println("teusday is happy day");
			break;
		case 1:
			System.out.println("monday");
			System.out.println("monday is working day");
			break;
		case 3:
			System.out.println("wednesday");
			System.out.println("wednesday is not holiday");
			break;
		case 4:
			System.out.println("thrusday");
			System.out.println("thrusday is holiday");
			break;
		case 5:
			System.out.println("friday");
			System.out.println("friday is funday");
			break;
		case 6:
			System.out.println("saturday");
			System.out.println("saturday is weekend");
			break;

		default:
			System.out.println("enter the valid number");
			break;
		}
		System.out.println("after swich will execute");
	}

}
