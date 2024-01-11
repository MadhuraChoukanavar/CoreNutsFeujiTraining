package com.cnstf.fourthweekList30_11_23;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ClassItterator {
	public void displayArrayList(ArrayList<String> arrayList)
	{
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	
	public void displayLinkedList(LinkedList<String> list)
	{
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	
	public void displayVector(Vector<Integer> vect)
	{
		Iterator<Integer> iterator = vect.iterator();
		System.out.println("using iterator");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		Enumeration<Integer> elements = vect.elements();
		System.out.println("using enumeration");
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
	}

}
