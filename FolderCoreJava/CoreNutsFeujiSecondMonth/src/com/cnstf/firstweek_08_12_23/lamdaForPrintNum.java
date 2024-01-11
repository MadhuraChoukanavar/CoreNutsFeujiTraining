package com.cnstf.firstweek_08_12_23;

public class lamdaForPrintNum {
	public static void main(String[] args) {

		MyInterfacePrintNum print = (a) -> {
			for (int i = 1; i < a; i++) {
				System.out.println(i);
			}

		};
		print.printNum(10);
	}
}
