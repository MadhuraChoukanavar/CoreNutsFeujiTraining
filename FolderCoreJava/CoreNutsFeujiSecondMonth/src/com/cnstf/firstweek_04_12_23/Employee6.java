package com.cnstf.firstweek_04_12_23;

import java.util.Objects;

public class Employee6 {
	
	int i;
	String string;
	double d;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	@Override
	public int hashCode() {
		return Objects.hash(d, i, string);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee6 other = (Employee6) obj;
		return Double.doubleToLongBits(d) == Double.doubleToLongBits(other.d) && i == other.i
				&& Objects.equals(string, other.string);
	}

	@Override
	public String toString() {
		return "Employee6 [i=" + i + ", string=" + string + ", d=" + d + "]";
	}

	public Employee6(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}

}
