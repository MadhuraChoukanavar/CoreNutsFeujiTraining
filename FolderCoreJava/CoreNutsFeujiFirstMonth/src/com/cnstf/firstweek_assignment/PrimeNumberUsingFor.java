package com.cnstf.firstweek_assignment;

public class PrimeNumberUsingFor {
	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 100;
		for (int number = number1; number <= number2; number++)

		{
			if (number <= 1) {
				continue;
			} else {
				boolean flag = true;
				for (int divide = 2; divide <= number / 2; divide++) {
					if (number % divide == 0) {
						flag = false;
						break;
					}

				}
				if (!flag) {
					System.out.println(number);
				}
			}

		}

	}

}
