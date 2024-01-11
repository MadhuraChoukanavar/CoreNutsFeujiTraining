package com.cnstf.thirdweekOOPs22_11_23;

import java.io.IOException;

//1.super class does not declare any exception but sub class declare exception
public class Case1 {
		public static void main(String[] args) {
			ParentClass p=new ParentClass();
			try {
				p.method1();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
}


//note ://if super class is throwing exception (Exception)and sub class is not than it will be no issue but vice versa it will be issue
//if super class is throwing checked exception and sub class have no exception than  error 
// if super class is throwing checked exception and sub class have no exception than  error 
//if super class is throwing unchecked exception and sub class have no exception than  no error 
//if parent class has no exception but subclass is throwing exception it will throw error
//case 1:if superclass does not throw exception but subclass throw checked it will throw error
//case 2:if superclass does not throw exception but subclass throw unchecked it will not throw error
//case 3:if super class have runtime exp and sub cls will throw compile it will throw error vise versa it wont throw error
//case 4: if super class is throwing exception child class is throwing child of tht exception it wont throw error
//case 5:if super class declare an exception and subclass declare without exception it will not throw error