package com.cnstf.firstweek_04_12_23;

import java.util.Iterator;



import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;





public class AdvOfListSet
{
	public static void main(String[] args) {
		AdvOfListSet adv=new AdvOfListSet();
		adv.setTest();
		adv.listTest();
	}
	
	public void listTest() {
		List<String> list = new LinkedList<>();
		list.add("madhura");
		list.add("sahana");
		list.add("savita");
		list.add("bassa");
		list.add("kanmani");
		list.add("kanmani");
		list.add("kanmani");

		System.out.println("forward itteration ");

		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("backword itteration ");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
	public void setTest()
	{
		
		TreeSet<Employee> set = new TreeSet<>();
		set.add(new Employee(1,"madhura","0983652"));
		set.add(new Employee(2,"sahana","98765434"));
		set.add(new Employee(5,"ram","456789"));
		set.add(new Employee(3,"seeta","98626871"));
		
		Iterator<Employee> iterator = set.iterator();
		System.out.println("Employee set:\n");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	
	
	//set doesnot allow duplicates but list will allow uplicate 
	//set cant print back words but list can do
}

