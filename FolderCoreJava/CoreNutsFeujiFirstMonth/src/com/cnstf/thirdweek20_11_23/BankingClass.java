package com.cnstf.thirdweek20_11_23;

import java.util.Scanner;

public class BankingClass implements Banking {
	static int balance = 10000;

	public static void main(String[] args) {
		BankingClass bank = new BankingClass();
		bank.checkingBalance();
		bank.displayBalance();

	}

	@Override
	public void checkingBalance() {
		System.out.println("your balance is " + balance);
		BankingClass bank = new BankingClass();
		try {
			bank.transaction();
		} catch (Exception e) {
			System.out.println("your balance is insaficient");
		}

	}

	@Override
	public void transaction() throws InsaficientBalanceException {
		Scanner scn = new Scanner(System.in);

		int withDrawAmount = scn.nextInt();

		if (withDrawAmount > balance) {

			throw new InsaficientBalanceException("your balance is not safficient " + balance);
		} else {
			System.out.println("enter else transaction");
			balance = balance - withDrawAmount;
		}

	}

	@Override
	public void displayBalance() {
		System.out.println("your current balance is " + balance);

	}

}
