package com.cnstf.firstweek_05_12_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

//5. Write a program to show the difference between HashMap and Hashtable and LinkedHashMap.
public class ShowDifference {
	
	public static void main(String[] args) {
		ShowDifference diff=new ShowDifference();
		diff.hashMap();
		diff.linkedHashMap();
		diff.treeMap();
	}
	
	public void hashMap()
	{
		Map <Student,Student> map=new HashMap<>();
		map.put(new Student("madhura",24, "banglore@1"),new Student("madhura",24, "banglore@1"));
		map.put(new Student("sahana",24, "banglore@1"),new Student("sahana",24, "banglore@1"));
		map.put(new Student("madhura",24, "banglore@2"),new Student("madhura",24, "banglore@2"));
		map.put(new Student("savita",24, "banglore@1"),new Student("savita",24, "banglore@1"));
		map.put(new Student("prsvalika",24, "banglore@1"),new Student("pravalika",24, "banglore@1"));
		map.put(null,null);
		map.put(null, null);
		
		System.out.println("''''''''''''''''''''");
		Set<Entry<Student, Student>> entrySet = map.entrySet();
		Iterator<Entry<Student, Student>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void linkedHashMap()
	{
		Map <Student,Student> map=new LinkedHashMap<>();
		map.put(new Student("madhura",24, "banglore@1"),new Student("madhura",24, "banglore@1"));
		map.put(new Student("sahana",24, "banglore@1"),new Student("sahana",24, "banglore@1"));
		map.put(new Student("madhura",24, "banglore@2"),new Student("madhura",24, "banglore@2"));
		map.put(new Student("savita",24, "banglore@1"),new Student("savita",24, "banglore@1"));
		map.put(new Student("madhura",24, "banglore@1"),new Student("madhura",24, "banglore@1"));
		map.put(null,null);
		map.put(null, null);
		System.out.println("''''''''''''''''''''");
		Set<Entry<Student, Student>> entrySet = map.entrySet();
		Iterator<Entry<Student, Student>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	public void treeMap()
	{
		SortedMap <Student,Student> map=new TreeMap<>();
		map.put(new Student("madhura",24, "banglore@1"),new Student("madhura",24, "banglore@1"));
		map.put(new Student("sahana",24, "banglore@1"),new Student("sahana",24, "banglore@1"));
		map.put(new Student("madhura",24, "banglore@2"),new Student("madhura",24, "banglore@2"));
		map.put(new Student("savita",24, "banglore@1"),new Student("savita",24, "banglore@1"));
		map.put(new Student("madhura",24, "banglore@1"),new Student("madhura",24, "banglore@1"));
//		map.put(null,null);
	//	map.put(null, null);
		System.out.println("''''''''''''''''''''");
		Set<Entry<Student, Student>> entrySet = map.entrySet();
		Iterator<Entry<Student, Student>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}

//note:   hash map will print in random order and allow only one key as null and n number of null values
//linked map will print in insertion order and allow  only one key as null and n number of null values
//tree map will print in sorted order and doest allow null key and n number of null value it will aloow
