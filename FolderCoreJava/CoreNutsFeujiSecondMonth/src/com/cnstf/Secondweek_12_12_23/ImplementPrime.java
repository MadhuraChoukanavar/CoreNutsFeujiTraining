package com.cnstf.Secondweek_12_12_23;

public class ImplementPrime {
	public static boolean isPrime(int num)
	{
		if(num<=1)return false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}
