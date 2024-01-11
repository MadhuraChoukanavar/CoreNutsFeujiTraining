package com.cnstf.fourthweekList30_11_23;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Vector;

public class IteratorAndEnumerator {
	public static void main(String[] args) {
		//IteratorAndEnumerator iterEnum=new  IteratorAndEnumerator();
		ClassItterator classItt=new ClassItterator();
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("madhura");
		arrayList.add("sahana");
		arrayList.add("aparna");
		System.out.println("---------ArrayList--------");
		classItt.displayArrayList(arrayList);
		
		
		LinkedList<String> list=new LinkedList<>();
		list.add("madhura");
		list.add("Sahana");
		list.add("aparna");
		System.out.println("---------LinkedList--------");
		classItt.displayLinkedList(list);
		
		Vector<Integer> vect=new Vector<>();
		vect.add(10);
		vect.add(20);
		vect.add(40);
		vect.add(90);
		System.out.println("---------vector--------");
		classItt.displayVector(vect);
		
	}
	
}
