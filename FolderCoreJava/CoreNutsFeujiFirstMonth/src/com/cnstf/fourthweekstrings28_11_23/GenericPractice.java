package com.cnstf.fourthweekstrings28_11_23;
//1. Write a program to show advantage of using generics. 
//Show the problem and give the solution for that using generic concept.
import java.util.ArrayList;
import java.util.List;

import com.cnstf.fourthweekstrings29_11_23.Person;
//in this example taking array and adding String,integer and person type but whn we try to print it will get 
//classCastException
//so we add generic line person it wont allow any other object to add in tht list
public class GenericPractice {
	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add("Madhura");
//		list.add(100);
//		list.add(new Person());
//	for(Object obj:list)
//	{
//		System.out.println((Person)obj);
//	}
//
		
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person());
		list.add(new Person());
	//	list.add(100); it will through error bcoz it will only accept person type object
		

	}

}
