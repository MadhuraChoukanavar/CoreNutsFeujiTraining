package com.cnstf.secondweek15_11_23_1;

import com.cnstf.secondweek15_11_23.DiffBWtnDefaultAndProtected;
//but in other package only protected can be accessed only if it has parent child relation  but cant access default
public class TestForDefndPro extends DiffBWtnDefaultAndProtected{
	public static void main(String[] args) {
		
		TestForDefndPro defAndPro=new TestForDefndPro();
		System.out.println(defAndPro.empId);
		
	}
	
}


