package com.cnstf.firstweek_05_12_23;
//3. Write a program to get key and values at a time from HasMap.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class KeyValueAtTime {
	
	public static void main(String[] args) {
		KeyValueAtTime keyValueAtTime = new KeyValueAtTime();
		keyValueAtTime.keyValueAtTime();
	}
	public void keyValueAtTime()
	{
		Map<String ,Student> map=new HashMap<>();
		map.put("madhura", new Student("madhura",10,"banglore1"));
		map.put("sahana", new Student("sahana",20,"banglore1"));
		map.put("savita", new Student("savita",30,"banglore1"));
		map.put("madhura", new Student("madhura",10,"banglore2"));
		 Set<Entry<String, Student>> entrySet = map.entrySet();
		 Iterator<Entry<String, Student>> iterator2 = entrySet.iterator();
		// System.out.println("output for entry set");
		 while(iterator2.hasNext())
		 {
			 Entry<String, Student> key = iterator2.next();
			 System.out.println(key);
		 }
	}
}
