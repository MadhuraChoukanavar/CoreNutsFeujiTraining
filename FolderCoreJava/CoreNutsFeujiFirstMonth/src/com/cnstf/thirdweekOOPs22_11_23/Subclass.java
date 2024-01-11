package com.cnstf.thirdweekOOPs22_11_23;

import java.io.IOException;

public class Subclass extends ParentClass{
	public Subclass() {
		super();
	
	}

	public Subclass(int id, String name) throws IOException {
		super(id, name);
	super.method1();
	}

	@Override
	void method1 () 
	{
		System.out.println("method1 from subclass");
	}

}
