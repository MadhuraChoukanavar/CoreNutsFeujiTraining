package com.cnstf.firstweek_05_12_23;

import java.util.HashMap;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//1. Write a program to show the behavior of HashMap 
//using different ways of iterations?
public class MapUsingDiffIterator {
	public void iterateMap()
	{
		Map<String ,Student> map=new HashMap<>();
		map.put("madhura", new Student("madhura",10,"banglore1"));
		map.put("sahana", new Student("sahana",20,"banglore1"));
		map.put("savita", new Student("savita",30,"banglore1"));
		map.put("madhura", new Student("madhura",10,"banglore2"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		 System.out.println("output for key set");
		while(iterator.hasNext())
		{
		String key = iterator.next();
			Student value = map.get(key);
			System.out.println("key is = "+key+ " value is = "+value);
		}
		
		 Set<Entry<String, Student>> entrySet = map.entrySet();
		 Iterator<Entry<String, Student>> iterator2 = entrySet.iterator();
		 System.out.println("output for entry set");
		 while(iterator2.hasNext())
		 {
			 Entry<String, Student> key = iterator2.next();
			 System.out.println(key);
		 }
	}

}
