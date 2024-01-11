package com.cnstf.fourthweekList30_11_23;

import java.util.ArrayList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

//6. Show the difference between ArrayList and Vector and LinkedList.
public class DiffBwLists {
	public static void main(String[] args) {
		DiffBwLists diff = new DiffBwLists();
		ArrayList<String> arraylist = diff.arraylist();
		System.out.println("------------ArrayList-----------");
		diff.displayArray(arraylist);
		LinkedList<String> linkedList=diff.linkedList();
		System.out.println("------------LinkedList-----------");
		diff.displayLinkedList(linkedList);
		Vector<String> vect=new Vector<>();
		
		diff.displayVector(vect);	
		
	}
	public ArrayList<String> arraylist() {
		ArrayList<String> list = new ArrayList<>();
		list.add("madhura");
		list.add("sahana");
	
		
		//in arrayslist we dont have add 1st and add last methods
		return list;
	}
	public void displayArray(ArrayList<String> list) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public LinkedList<String> linkedList() {
		LinkedList<String> list = new LinkedList<>();
		list.add("madhura");
		list.add("sahana");
		//in linkedlist we  have add 1st and add last methods
		list.addFirst("savita");
		list.addLast("sahana");
		return list;
	}
	public void displayLinkedList(LinkedList<String> list) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	public Vector<String> vector()
	{
		Vector<String> vect=new Vector<>();
		vect.add("madhura");
		vect.add("sahana");
		vect.add("savita");
		vect.add("aparna");
		return vect;
		
		
	}
	public void displayVector(Vector<String> vect)
	{
		Enumeration<String> elements = vect.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
	}
	}
