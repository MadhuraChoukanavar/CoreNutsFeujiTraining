package com.cnstf.fourthweekList30_11_23;
//4. Create a program to add primitive data type elements to arraylist 

//object and display the elements using for loop and Iterator interface.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddPrimitiveTocoll {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(2.0);
		list.add(70);
		
		AddPrimitiveTocoll addprimitive=new AddPrimitiveTocoll();
		addprimitive.display(list);
		
	}
	public void display(List list)
	{
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
public void	displayByIterator(List list)
{
	Iterator iterator = list.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	}
}

//we can't add primitive data to arraylist or collections if we add primitive types there auto-boxing  will takes place