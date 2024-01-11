package com.cnstf.firstweek_05_12_23;
//6. Write program sort the Employee elements based on name or location from ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortArrayList {
	
	public static void main(String[] args) {
		 SortArrayList s=new  SortArrayList();
				 s.addEmployee2();
	}
	public void addEmployee2()
	{
		List<Employee2> list=new ArrayList<>();
		list.add(new Employee2(10, "pravalika", "anatapur"));
		
		list.add(new Employee2(20, "joyti", "nellur"));
		list.add(new Employee2(30, "ramya", "hubli"));
		list.add(new Employee2(40, "varsha", "gadag"));
		list.add(new Employee2(50, "madhura", "laxmeshwar"));
		
		
		Collections.sort(list,new ComparatorFOrocation());
		Iterator<Employee2> iterator1 = list.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
//		Set<Employee2> set=new TreeSet<>(new ComparatorFOrocation());
//		set.addAll(list);
//		//Set<Employee2> set1=new TreeSet<>(list);
//	Iterator<Employee2> iterator2 = set.iterator();
//	while(iterator2.hasNext())
//	{
//		System.out.println(iterator2.next());
//	}
//		
	}
}
