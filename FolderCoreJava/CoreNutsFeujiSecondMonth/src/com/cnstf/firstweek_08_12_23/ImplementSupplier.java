package com.cnstf.firstweek_08_12_23;

import java.util.function.Supplier;

public class ImplementSupplier {
	public static void main(String[] args) {
		Supplier<Integer> sup=()->
		{
			return 10;
		};
		System.out.println(sup.get());
		
	}

}
