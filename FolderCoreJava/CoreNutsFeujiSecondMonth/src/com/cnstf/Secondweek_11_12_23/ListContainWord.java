package com.cnstf.Secondweek_11_12_23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//3. Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
public class ListContainWord {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("madhura");
		list.add("sahana");
		list.add("aparna");
		list.add("savita");
		list.add("bassa");
		
		Predicate<List<String>>pre=stringList->{return (stringList.contains("madhura"));
		};
		
		System.out.println(pre.test(list));
		}

}
