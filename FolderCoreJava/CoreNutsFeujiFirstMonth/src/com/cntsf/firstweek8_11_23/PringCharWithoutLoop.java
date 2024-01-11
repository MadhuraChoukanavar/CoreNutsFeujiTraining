package com.cntsf.firstweek8_11_23;

public class PringCharWithoutLoop {
	public static void main(String[] args) {
		PringCharWithoutLoop printName = new PringCharWithoutLoop();
		char[] charArray = { 'm', 'a', 'd', 'h', 'u', 'r', 'a' };
		System.out.println(printName.display(charArray, 0, ""));
	}

	public String display(char[] charArray, int index, String name) {
		if (index < charArray.length) {
			return name + charArray[index++] + display(charArray, index, name);
		}
		return name;
	}
}
