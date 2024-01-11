package com.cnstf.firstweek_06_12_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestForArrayList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(15);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
