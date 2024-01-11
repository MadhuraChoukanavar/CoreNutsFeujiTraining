package com.cntsf.firstweek9_11_23.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cntsf.firstweek9_11_23.ArithmeticOperator;

public class TestClass {

	ArithmeticOperator arirhmeticOperator = new ArithmeticOperator();
	
	@Test
	public void additionOPeratorsTestInt()
	{
		int a=12;
		int b=13;
		int res = arirhmeticOperator.add(a,b);

		System.out.println(res);
		assertEquals(25,res);
	}

}
