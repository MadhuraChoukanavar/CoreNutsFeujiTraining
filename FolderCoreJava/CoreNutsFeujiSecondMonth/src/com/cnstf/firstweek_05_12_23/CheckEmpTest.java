package com.cnstf.firstweek_05_12_23;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckEmpTest {
	
	@Test
	public void checkEMp()
	
	{
		long empCheck = new EmployeeCheck().empCheck("Gopi");
		  assertEquals(1, empCheck);
	}

}
