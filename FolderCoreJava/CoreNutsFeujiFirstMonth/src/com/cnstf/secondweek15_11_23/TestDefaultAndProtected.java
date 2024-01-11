package com.cnstf.secondweek15_11_23;
//both default and protected we can access through instance in same package
public class TestDefaultAndProtected  {
	public static void main(String[] args) {
		DiffBWtnDefaultAndProtected defAndPro=new DiffBWtnDefaultAndProtected();
		System.out.println(defAndPro.empId);
		System.out.println(defAndPro.name);
		
	}

}
