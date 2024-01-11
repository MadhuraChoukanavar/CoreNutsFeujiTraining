package com.cnstf.fourthweekList30_11_23;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.LinkedList;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(10);
		list.add(50);
		list.add("vbn");
		int sum = 0;      
		
		String s="i love java vai";
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("a"));

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Integer) {
				sum = sum + (int) list.get(i);
			}
		}
		System.out.println(sum);
	}
     
       String c = "Hello i love java";
       int start = 2;
       int end = 9;
       char s[]=new char[end-start];
     // c.getChars(start,end,s,0);
      // System.out.println(s);
    
}
