package com.cnstf.firstweek_07_12_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashAndConcurrentHashMap {
	public static void main(String[] args) {
		HashMapInThread threadMap=new HashMapInThread();
		threadMap.TestMap();
	}

}

class HashMapInThread extends Thread
{
	
	public void TestMap()
	{
		Map<Integer, String>  map=new HashMap<>();
		map.put(01, "val1");
		map.put(02, "val2");
		map.put(03, "val1");
		map.put(05, "val5");
		map.put(04, "val3");
		map.put(05, "val5");
	System.out.println(	map.get(10));
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	}
