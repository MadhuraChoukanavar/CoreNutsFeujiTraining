package com.cnstf.fourthweekList30_11_23;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
//we can't iterate arraylist and linkedlist through enumerator
//in iterator we have hasnext and nextmethod
//in enumerator we have hasnextelement and next element are thr
public class Enumerator {
//	public void displayArrayList(ArrayList<String> arrayList)
//	{
//		 Enumeration<Integer> elements = arrayList.elements();
//			while(elements.hasMoreElements())
//			{
//				System.out.println(elements.nextElement());
//			}
//		
//	}
//	
//	public void displayLinkedList(LinkedList<String> list)
//	{
//		 Enumeration<Integer> elements = list.elements();
//			while(elements.hasMoreElements())
//			{
//				System.out.println(elements.nextElement());
//			}
//	}
//	
	public void displayVector(Vector<Integer> vect)
	{
		  Enumeration<Integer> elements = vect.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
	}


}
