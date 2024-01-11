package com.cnstf.thirdweek20_11_23;

import java.io.IOException;

public class HandlingClass {
	public static void main(String[] args) {
		HandleInotherClass handle=new HandleInotherClass();
		try {
			handle.ThrowException();
		
		

		} catch (IOException e) {
			System.out.println("exception handeled in calling class");
		}	
		finally {
			System.out.println();
		}
}}
