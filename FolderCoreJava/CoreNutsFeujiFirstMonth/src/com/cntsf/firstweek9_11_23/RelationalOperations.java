package com.cntsf.firstweek9_11_23;

public class RelationalOperations {
	public static void main(String[] args) {
		RelationalOperations relOpp=new RelationalOperations();
		System.out.println(relOpp.lessThanOperator(10, 100));
		System.out.println(relOpp.greaterThanOperator(10, 100));
		System.out.println(relOpp.equalsOperator(10, 100));
		System.out.println(relOpp.relationoppWithUneryOpp(4, 5));
		
	}
	public boolean lessThanOperator(int val1,int val2)
	{
		return val1<=val2;
	}
	public boolean greaterThanOperator(int val1,int val2)
	{
		return val1>=val2;
	}

	public boolean equalsOperator(int val1,int val2)
	{
		return val1==val2;
	}
	
	public boolean relationoppWithUneryOpp(int val1,int val2)
	{
		return (val1++==--val1);
		
	}

}
