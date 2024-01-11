package com.cnstf.firstweek_08_12_23;

import java.util.function.Function;

public class AnanomusForRunnable {
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 4; i++) {
					System.out.println(i);
				}

			}
		});
		th.start();
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (char i = 'a'; i <= 'c'; i++) {
					System.out.println(i);
				}

			}
		});
		th1.start();

	}
}
