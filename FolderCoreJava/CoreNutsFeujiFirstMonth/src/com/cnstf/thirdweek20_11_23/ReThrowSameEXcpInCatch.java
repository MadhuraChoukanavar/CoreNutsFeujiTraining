package com.cnstf.thirdweek20_11_23;
//5.write a program to re-throw the same exception from catch block
public class ReThrowSameEXcpInCatch {
	String name =null;
	public static void main(String[] args) {
		ReThrowSameEXcpInCatch reThrow=new ReThrowSameEXcpInCatch();
		reThrow.reThrowIncatch(null);
	}
	public void reThrowIncatch(String name)
	
	{
		try {
		System.out.println(name.charAt(0));
		}
		catch (Exception e) {

			System.out.println("the perticular exception"+e.getMessage());
			System.out.println(name.charAt(10));
		}
		
	}

}
