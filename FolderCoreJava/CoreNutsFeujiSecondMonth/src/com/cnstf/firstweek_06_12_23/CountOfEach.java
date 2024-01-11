package com.cnstf.firstweek_06_12_23;


import java.util.HashMap;


import java.util.Map;
import java.util.Map.Entry;


public class CountOfEach {
	public static void main(String[] args) {
	
		String s="Core nuts technologies located in Bangalore Core nuts technologies located in hyderabad Core nuts technologies in Hyderabad Core nuts technologies in Bangalore";

		String[] stringArray = s.split(" ");
		Map<String, Integer> map=new HashMap<>();
		int count =0;
		for(String string:stringArray)
		{
			if(map.containsKey(string))
			{
			 count = map.get(string);
			 count++;
				map.put(string, count);
				
			}
			else
			{
				map.put(string, 1);
			}
			
		}
		for(Entry<String, Integer> entrySet : map.entrySet()){
			System.out.println(entrySet);
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	String[] s1= s.split(" ");
	//	List<String> list=List.of(s1);
		
//		for(int outerIndex=0;outerIndex<s1.length-1;outerIndex++)
//		{
//			int count=0;
//			for(int innerIndex=outerIndex+1;innerIndex<s1.length;innerIndex++)
//			if(list.get(outerIndex).equals(list.get(innerIndex)))
//			{
//				count++;
//				String re=list.get(innerIndex);
//				list.remove(innerIndex);
//				
//			}
//			System.out.println(s1[outerIndex]+count);
//		}
//		
		
	
	}

}
