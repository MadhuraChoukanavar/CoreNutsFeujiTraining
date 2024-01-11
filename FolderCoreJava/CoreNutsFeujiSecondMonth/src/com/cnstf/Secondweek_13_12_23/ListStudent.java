package com.cnstf.Secondweek_13_12_23;
//1.List names of the students from student records using streams?

import java.util.ArrayList;
import java.util.List;

//Create a new Student Pojo Class with following attributes: Id,Name,Gender,Department, address, City, State.

public class ListStudent {
	public static List<Students> createList()
	{
		List<Students> stuList=new ArrayList<>();
		stuList.add(new Students(10, "madhura", "female", "civil", "@laxmeshwar", "laxmeshwar", "karnataka"));
		stuList.add(new Students(20, "sahana", "female", "Mech", "@laxmeshwar", "laxmeshwar",  "karnataka"));
		stuList.add(new Students(30, "aparna", "female", "cse", "@gadag", "gadag",  "karnataka"));
		stuList.add(new Students(40, "savita", "female", "ece", "@annigeri", "annigeri",  "karnataka"));
		stuList.add(new Students(50, "chetana", "female", "cse", "@mudola", "mudola",  "karnataka"));
		stuList.add(new Students(60, "Sidh", "male", "maths", "@trivandrum", "trivandrum", "kerala"));
		stuList.add(new Students(70, "shashank", "male", "arts", "@gadag", "gadag",  "karnataka"));
		stuList.add(new Students(80, "kartik", "male", "maths", "@yelburga", "yelburga",  "karnataka"));
		return stuList;
		
	}
}
