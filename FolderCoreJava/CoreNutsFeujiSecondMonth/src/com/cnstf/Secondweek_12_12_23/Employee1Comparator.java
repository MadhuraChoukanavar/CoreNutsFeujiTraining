package com.cnstf.Secondweek_12_12_23;

import java.util.Comparator;

public class Employee1Comparator {
	Comparator<Employee1> comp=(Employee1 e1,Employee1 e2)->
	{
		return e1.getEmpSal()-(e2.getEmpSal());
	};

}
