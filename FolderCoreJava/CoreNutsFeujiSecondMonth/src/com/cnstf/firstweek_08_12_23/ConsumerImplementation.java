package com.cnstf.firstweek_08_12_23;

import java.util.function.Consumer;

public class ConsumerImplementation {
	public static void main(String[] args) {
		Consumer<Integer> c=(a)->
		{
			for(int i=0;i<=a;i++)
			{
				System.out.println(i);
			}
		};
		c.accept(100);
		
		
		Consumer<String> conString=(s)->
		{
			System.out.println(s.toUpperCase());
		};
		conString.accept("madhuRA");
	}

}
