package com.cnstf.fourthweekstrings27_11_23;

import javax.print.DocFlavor.BYTE_ARRAY;

//6. Write a program to implement different methods of wrapper class.
public class MethodsInWrapperCls {
	public static void main(String[] args) {

		Integer integer = new Integer(102);
		Integer integer2 = new Integer(112);
		System.out.println(integer.byteValue());
		System.out.println(integer.compareTo(integer2));
		//hashcode
		int hashCode = integer.hashCode();
		System.out.println(hashCode);
		System.out.println(integer2.hashCode());
		//number format exception
	//	Integer integer3=new Integer("p785");
	//	System.out.println(integer3.parseInt(null));
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.max(10, 100));
		System.out.println(Integer.numberOfLeadingZeros(hashCode));

	}
}