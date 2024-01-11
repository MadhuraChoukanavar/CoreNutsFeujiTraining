package com.cntsf.firstweek9_11_23;

public class ProgramUsingBODMAS {
	public static void main(String[] args) {
		ProgramUsingBODMAS bodmas=new ProgramUsingBODMAS();
		System.out.println(bodmas.useBodmas(4, 2));
		
	}
	
	public int useBodmas(int val1,int val2)
	{
		return (val1+val2)*val2+val1++-val1* val2/2;
	}


}
