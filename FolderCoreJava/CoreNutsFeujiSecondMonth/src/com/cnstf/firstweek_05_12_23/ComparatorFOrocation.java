package com.cnstf.firstweek_05_12_23;

import java.util.Comparator;

public class ComparatorFOrocation implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.getEmpLocation().compareTo(o2.getEmpLocation());
	}

}
