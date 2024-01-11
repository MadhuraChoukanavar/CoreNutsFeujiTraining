package com.cnstf.firstweek_04_12_23;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//9. Write a program to print list elements in forward and backward direction?
public class PrintListElements {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("madhura");
		list.add("sahana");
		list.add("aparna");
		list.add("savita");
		list.add("chetana");
		list.add("bassa");
		
		ListIterator<String> listIterator = list.listIterator();
		System.out.println("forward direction");
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		System.out.println("reverse direction");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
	}
}
