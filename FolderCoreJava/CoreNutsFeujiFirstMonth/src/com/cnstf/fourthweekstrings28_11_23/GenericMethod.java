package com.cnstf.fourthweekstrings28_11_23;
//3. Declare generic methods, but class is not generic. Access the generic method by providing generic type.
public class GenericMethod {
	public <String> void genMethod(String val1,String val2)
	{
		System.out.println(val1);
		System.out.println(val2);
	}
	public static void main(String[] args) {
		GenericMethod gm=new GenericMethod();
	gm.genMethod("MADHURA", "SAHANA");
	}
}
