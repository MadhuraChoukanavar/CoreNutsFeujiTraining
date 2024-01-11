package com.cnstf.fourthweekList30_11_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestPersonImpComparable {
	public static void main(String[] args) {
		List<PersonImpCombarable> list =new ArrayList<>();
		list.add(new PersonImpCombarable(10,"madhura"));
		list.add(new PersonImpCombarable(10,"kittur"));
		list.add(new PersonImpCombarable(20,"sahana"));
		list.add(new PersonImpCombarable(20,"megha"));
		list.add(new PersonImpCombarable(50,"asha")); 
		Collections.sort(list);
		//PersonImpCombarable personcomp=new PersonImpCombarable();
		for(PersonImpCombarable person:list)
		{
		System.out.println(person);
		}
	}

}
