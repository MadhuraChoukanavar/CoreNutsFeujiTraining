package com.cnstf.Secondweek_12_12_23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberOfNamesUsingStream {
	
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("madhura");
		list.add("sahana");
		list.add("savita");
		list.add("aparna");
		list.add("bassa");
		long count = list.stream().count();
		System.out.println(count);
		long count2 = list.stream().filter((e)->e.equals("madhura")).count();
		System.out.println(count2);
		
		//list.stream().collect(Collectors.groupingBy(e).counting());
		//Stream<String> stream = list.stream();
	//stream.forEach(e->System.out.println(e));
	
	//line 23 will through exception bcoz once you use the stream we can't use stream same stream again it will through exception
	//stream.filter(e->e.equals("madhura"));
	}

}
