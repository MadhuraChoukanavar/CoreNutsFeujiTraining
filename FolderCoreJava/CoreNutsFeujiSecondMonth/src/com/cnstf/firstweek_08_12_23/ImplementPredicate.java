package com.cnstf.firstweek_08_12_23;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ImplementPredicate {
	public static void main(String[] args) {
		Predicate<Integer> p=(a)->
		{
			return(a%2==0);
		};
		System.out.println(p.test(10));
		
		//Function<T, R>
		
	}

}
