package com.cnstf.firstweek_08_12_23;

import java.util.function.Function;

public class ImplementFunctionInterface {
	public static void main(String[] args) {
		Function<Integer, Integer> fun=(a)->
		{
			return a*10;
		};
		System.out.println(fun.apply(25));
	}

}
