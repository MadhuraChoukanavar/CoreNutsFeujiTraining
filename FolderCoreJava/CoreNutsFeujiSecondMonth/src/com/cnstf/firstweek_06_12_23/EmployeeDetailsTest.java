package com.cnstf.firstweek_06_12_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDetailsTest {
	public static void main(String[] args) {
		List<EmployeeDetails> list=new ArrayList<>();
		list.add(new EmployeeDetails("madhura", "IT", "banglore"));
		list.add(new EmployeeDetails("sahana", "Non-IT", "laxmeshwar"));
		list.add(new EmployeeDetails("madhura", "Non-IT", "laxmeshwar"));
		list.add(new EmployeeDetails("aparna", "IT", "gadag"));
		list.add(new EmployeeDetails("aparna", "Non-IT", "mysore"));
		list.add(new EmployeeDetails("savita", "IT", "mysore"));

	Map<String, Map<String, List<EmployeeDetails>>> mainMap=new HashMap<>();
	
	Map<String, List<EmployeeDetails>> innerMap=null;
	List<EmployeeDetails> tempList=null;
	
	
	for(EmployeeDetails emp:list)
	{
		if(mainMap.containsKey(emp.getLocation()))
		{
			innerMap=mainMap.get(emp.getLocation());
			if(innerMap.containsKey(emp.getDeptType()))
			{
				tempList=innerMap.get(emp.getDeptType());
				tempList.add(emp);
				innerMap.put(emp.deptType,tempList);
			}
			else
			{
				tempList=new ArrayList<>();
				tempList.add(emp);
				innerMap.put(emp.deptType, tempList);
			}
		}
			
		else
		{
			tempList =new ArrayList<>();
			tempList.add(emp);
			innerMap=new HashMap<>();
			innerMap.put(emp.getDeptType(), tempList);
			mainMap.put(emp.getLocation(), innerMap);
		}
	}
	Set<Entry<String, Map<String, List<EmployeeDetails>>>> entrySet = mainMap.entrySet();
	Iterator<Entry<String, Map<String, List<EmployeeDetails>>>> iterator = entrySet.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
	
}
	
	}
