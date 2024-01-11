package com.cnstf.secondweek15_11_23_1;

public class Test2 {
	public static void main(String[] args) {
		
	
	try {
		throw new NullPointerException();
		} catch (ArithmeticException e) {
		System.out.println("Arithmetic Exception!");
		} catch (NullPointerException e) {
		System.out.println("NullPointerException!");
		}

}
}