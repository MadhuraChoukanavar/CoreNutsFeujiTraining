package com.cnstf.secondweek15_11_23;

import com.cnstf.secondweek15_11_23_1.Ram;

public class TestRamWithINheritance extends Ram {
	public static void main(String[] args) {
	TestRamWithINheritance ram=new TestRamWithINheritance();
		//Ram ram1=new Ram();
		//TestRamWithINheritance ram=(TestRamWithINheritance)ram1;
		//TestRamWithINheritance ramchild=(TestRamWithINheritance) ram;
		String name2 = ram.name;
		// we can access the variables with protected wit inheritance
		System.out.println(ram.age);
		//System.out.println(ram.location); we cant access location bcoz its private
		//ram.phno we cant access phno bcoz its default 
		
		
		ram.nameOfPerson();//nameofperson is public so we can acces anywhere with in project
		ram.ageOfPerson();//ageofperson method is protected so we can acces with inheritance outside the package 
		//ram.locationofperson  location of person is private so we cant access outside the class
		//ram.phnoOfPerson phnoOfPerson is default so we can't	access outside package 
		}
	

}
