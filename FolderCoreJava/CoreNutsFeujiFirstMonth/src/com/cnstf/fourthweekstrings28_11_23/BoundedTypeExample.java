package com.cnstf.fourthweekstrings28_11_23;

import com.cnstf.fourthweekstrings29_11_23.Person;

//4. Write a program to pass restricted generic type objects to the function using bound type parameters.
public class BoundedTypeExample {
	
	//here T extends comparable so the value we are passing are T type so need to extend comarable
	//in line 14 animal wont extends or implements compareble so it will throw error
	//and it should implement same type foe ex comparable<string> menas it should also extend same
	public <T extends Comparable<String>> void compare(T val1,T val2)
	{
		System.out.println(val1);
		System.out.println(val2);
	}
	public static void main(String[] args) {
		 BoundedTypeExample bte=new BoundedTypeExample();
		//bte.compare(new Person(), new  Animal());
		 bte.compare(new Person(),new Person());
	}

}
