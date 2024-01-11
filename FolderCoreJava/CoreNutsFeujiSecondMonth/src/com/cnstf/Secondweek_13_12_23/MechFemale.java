package com.cnstf.Secondweek_13_12_23;

import java.util.List;
import java.util.stream.Collectors;

//5.List female students from the Mech department using streams?
public class MechFemale {
	
	public static void main(String[] args) {
		List<Students> list = ListStudent.createList();
	 list.stream().collect(Collectors.groupingBy(Students::getsDepartment)).entrySet().stream()
	 .forEach((e)->
	 {
		 if(e.getKey().equalsIgnoreCase("mech"))
		 {
			 e.getValue().forEach((val)->
			 {
				 if(val.getsGender().equalsIgnoreCase("female"))
				 {
					 System.out.println(val.getSname());
				 }
			 });
			 
		 }
		 
	 });
		 
	 
				
					//or
//					list.stream().filter((dept)->dept.getsDepartment().equals("Mech")).filter((gender)->gender.getsGender()
//							.equalsIgnoreCase("female")).forEach((e)->System.out.println(e.getSname()));
		
	}

}
