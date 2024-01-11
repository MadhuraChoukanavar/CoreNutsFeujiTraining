package com.cnstf.fourthweekstrings28_11_23;

import com.cnstf.fourthweekstrings29_11_23.Person;

public class TestForGenericClass {
	public static void main(String[] args) {
		GenericClass<String> gc=new GenericClass<>();
		//line 7 will throw error bcoz we are trying to add integer in string type
		//gc.setId(10);
		gc.setId("madhura");
	System.out.println(	gc.getId());
		GenericClass<Integer> gc1=new GenericClass<>();
		gc1.setName(10);
		System.out.println(gc1.getName());
		GenericClass<Person> gc2=new GenericClass<>();
		gc2.setId(new Person() );
	System.out.println(gc2.getId());
		
	}

}
