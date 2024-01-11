package com.cnstf.firstweek_05_12_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SeperateWithGender {
	
	public static void main(String[] args) {
		List<Student1> listM =new ArrayList<>();
		List<Student1> listF =new ArrayList<>();
		Map<String, List<Student1>> map=new HashMap<>();
		SeperateWithGender sep=new SeperateWithGender();
		sep.addStu(listM, listF);
		map.put("male", listM);
		map.put("female", listF);
		Set<Entry<String, List<Student1>>> entrySet = map.entrySet();
		Iterator<Entry<String, List<Student1>>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}
	public void addList(List<Student1> listM,List<Student1> listF,Student1 s) {
		
	String s1=s.getGender();
	if(s1.equals("male"))
		{
			listM.add(s);
		}
	else
	{
		listF.add(s);
	}
			}
	
	public void addStu(List<Student1> listM,List<Student1> listF)
	{
		SeperateWithGender sep=new SeperateWithGender();
		sep.addList(listM, listF, new Student1("madhura", "female"));
		sep.addList(listM, listF, new Student1("aparna", "female"));
		sep.addList(listM, listF, new Student1("karthik", "male"));
		sep.addList(listM, listF, new Student1("sidh", "male"));
		sep.addList(listM, listF, new Student1("m", "female"));
		sep.addList(listM, listF, new Student1("q", "female"));
		sep.addList(listM, listF, new Student1("a", "male"));
		sep.addList(listM, listF, new Student1("f", "male"));
	}

}
