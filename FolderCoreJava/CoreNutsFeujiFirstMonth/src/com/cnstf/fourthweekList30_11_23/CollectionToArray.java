package com.cnstf.fourthweekList30_11_23;

import java.util.ArrayList;

import java.util.List;

// 2.Write a program to convert a collection to an array?
public class CollectionToArray {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("madhura");
		list.add("sahana");
		list.add("aparna");
		list.add("savita");
		System.out.println("print collection objects");
		for(String s:list)
		{
			System.out.println(s);
		}
		Object[] array = list.toArray();
		System.out.println("print array  objects");
		for(Object s:array)
		{
			System.out.println(s);
		}
	}

}
