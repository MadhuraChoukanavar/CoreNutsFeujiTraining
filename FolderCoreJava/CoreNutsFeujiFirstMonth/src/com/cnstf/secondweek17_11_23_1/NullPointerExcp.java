package com.cnstf.secondweek17_11_23_1;
//8. write a program not to throw null pointer exception 
public class NullPointerExcp {
	public static void main(String[] args) {
		String value;
		value=null;
		//line 7 witll throw null pointer exception bcoz value is null and we are searching 
		try {

			System.out.println(value.charAt(0));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}


}
