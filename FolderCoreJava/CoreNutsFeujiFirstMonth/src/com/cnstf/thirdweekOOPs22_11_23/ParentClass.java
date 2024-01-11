package com.cnstf.thirdweekOOPs22_11_23;

import java.io.IOException;

public class ParentClass {
	int id;
	String name;
	public ParentClass() {
		super();
		
	}
	public ParentClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void method1()throws IOException
	{
		System.out.println("method1 from parent");
	}

}
