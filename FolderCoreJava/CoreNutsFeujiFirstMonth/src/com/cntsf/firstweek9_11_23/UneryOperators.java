package com.cntsf.firstweek9_11_23;

public class UneryOperators {
	public static void main(String[] args) {
		UneryOperators uopp=new UneryOperators();
		int result1=uopp.testIncrementOperator(4, 5);
		System.out.println(result1);
		int result2=uopp.testDecrementOperator(4, 5);
		System.out.println(result2);
		
		
	}
	public int testIncrementOperator(int val1 ,int val2)
	{
		int res=(val1++ + ++val2);
		System.out.println(res++);
		return res;
	}
	public int testDecrementOperator(int val1 ,int val2)
	{
		int res=(val1-- + val2--)+(10- --val1);
		System.out.println(res++);
		System.out.println(val1);
		System.out.println(val2);
		return ++res;
	}
}
