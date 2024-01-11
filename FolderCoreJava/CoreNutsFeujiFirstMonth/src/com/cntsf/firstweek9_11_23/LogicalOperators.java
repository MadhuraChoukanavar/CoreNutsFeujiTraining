package com.cntsf.firstweek9_11_23;

public class LogicalOperators {
	public static void main(String[] args) {
		LogicalOperators logicOpp=new LogicalOperators();
		System.out.println(logicOpp.andOperator(4,5));
		System.out.println(logicOpp.orOperator(4,5));
		
	}
	boolean andOperator(int val1,int val2)
	{
		System.out.println((val1++<--val2));
		System.out.println((val1-->val2));
		return (val1++<--val2)&&(val1-->val2);
	}
	boolean orOperator(int val1,int val2)
	{
		System.out.println(val1);
		System.out.println(val2);
		return (val1++<--val2)||(val2<val1);
	}


}
