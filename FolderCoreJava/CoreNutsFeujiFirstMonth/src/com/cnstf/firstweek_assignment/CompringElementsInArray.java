package com.cnstf.firstweek_assignment;

import java.util.Random;

public class CompringElementsInArray {
	public static void main(String[] args) {
		int[] random = new int[25];
		CompringElementsInArray compar = new CompringElementsInArray();
		compar.generateNumber(random);
	}
	public void generateNumber(int[] random) {
		Random randomNum = new Random();
		for (int index = 0; index < random.length; index++) {
			random[index] = randomNum.nextInt(30);
			System.out.print(random[index] + " ,");
		}
		System.out.println();
		int index = 0;
		while (index < random.length - 1) {
			if (index == 2) {
				index++;
				continue;
			}
			if (random[index] < random[1]) {
				System.out.print(random[index] + "<" + random[1] + " , ");
			} else if (random[index] > random[1]) {
				System.out.print(random[index] + ">" + random[1] + " , ");
			} else {
				System.out.print(random[index] + "=" + random[1] + " , ");
			}
			index++;
		}
	}
}
