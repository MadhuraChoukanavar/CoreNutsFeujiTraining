package com.cnstf.secondweek16_11_23;

import java.util.Random;

public class GenerateOtp {
	public static void main(String[] args) {

		Random random = new Random();
		String randomOTP="";
		for (int number = 1; number <= 4; number++) {
			int num = random.nextInt(9);
			randomOTP=randomOTP+num;
			//System.out.print(num);

		}
		System.out.println(randomOTP);

	}

}
