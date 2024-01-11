package com.cnstf.thirdweek20_11_23;
//3.write a program to raise the user defined  exception from catch block
import java.util.Scanner;

public class UserDefinedExceptionInCatch {
	static int bankBalance=10000;
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int amount=scn.nextInt();
		UserDefinedExceptionInCatch userExp=new UserDefinedExceptionInCatch();
		try {
			userExp.methodForThrowingException( bankBalance,amount);
		} catch (InsaficientBalanceException e) {
		System.out.println("your balance is insafficient");
		}
		}
	public void methodForThrowingException(int balance,int amount) throws InsaficientBalanceException
	{
		
		try {
			int result=balance/0;
		}
		catch (Exception e) {
			System.out.println("arthimatic Exception");

			if (amount > balance) {

				throw new InsaficientBalanceException("your balance is not safficient " + balance);
				//unreachable whatever we write
			} else {
				balance = balance - amount;
				System.out.println("transaction done successfully your balance is "+balance);
				
				
			}


		}
	}
}
