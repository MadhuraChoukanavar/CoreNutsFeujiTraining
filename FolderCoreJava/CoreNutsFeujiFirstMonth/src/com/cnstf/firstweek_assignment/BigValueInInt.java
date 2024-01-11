package com.cnstf.firstweek_assignment;

import java.util.Scanner;

public class BigValueInInt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter 3 digit  number");
		int number = scn.nextInt();
		if (number < 110 || number > 999) {
			System.out.println(" invalid number please enter 3 digit number");
		} else {
			BigValueInInt bigValu = new BigValueInInt();
			System.out.println(bigValu.bigValue(number));
		}

	}

	public int bigValue(int number) {
		int bignum = 0;
		while (number > 0) {
			int number1 = number % 10;
			// System.out.println(number1);
			if (number1 > bignum) {
				bignum = number1;
				// System.out.println(bignum);
			}
			number = number / 10;
			// System.out.println(number1);
		}
		return bignum;
	}

}
