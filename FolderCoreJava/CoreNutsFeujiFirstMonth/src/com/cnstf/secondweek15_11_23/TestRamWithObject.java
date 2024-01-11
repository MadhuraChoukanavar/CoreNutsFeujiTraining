package com.cnstf.secondweek15_11_23;

import com.cnstf.secondweek15_11_23_1.Ram;

public class TestRamWithObject {
	public static void main(String[] args) {
		Ram ram=new Ram();
		String name = ram.name;//we can access name bcoz name is public
		//ram.age  age is protected so we cant access withpout inheritance in another package
		//ram.phno phno is package or default so we cant access outside package
		//ram.location location is private so we cant access outside the class
		
		
		
		ram.nameOfPerson(); // nameofperson method is public so we can access
		//ram.ageOfPerson  age is protected so we cant access withpout inheritance in another package
		//ram.phnoOfPerson phnoOfPerson is package or default so we cant access outside package
		//ram.locationOfPerson locationOfPerson is private so we cant access outside the class
				

		
	}

}
//note we can't use private and protected for classes