package com.cnstf.firstweek_08_12_23;

import java.util.function.BiFunction;

public class ImplementBiFunction {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFun=(val1,val2)->
		{
			return val1*val2;
			
		};
		System.out.println(biFun.apply(20, 30));
	}

}
