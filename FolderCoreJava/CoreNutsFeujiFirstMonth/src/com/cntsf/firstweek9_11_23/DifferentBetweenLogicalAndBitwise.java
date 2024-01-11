package com.cntsf.firstweek9_11_23;

public class DifferentBetweenLogicalAndBitwise {
	
	public static void main(String[] args) {
		DifferentBetweenLogicalAndBitwise LOgBit=new DifferentBetweenLogicalAndBitwise();
		System.out.println(LOgBit.testBitWise(3, 1));
		System.out.println(LOgBit.andOperator(4, 5));
	}
	
	//& will return int val
	public int testBitWise(int val1,int val2)
	{
		return val1&val2;
		
	}
	//&& will return boolean
	boolean andOperator(int val1,int val2)
	{
		System.out.println((val1++<--val2));
		System.out.println((val1-->val2));
		return (val1++<--val2)&&(val1-->val2);
	}

}
