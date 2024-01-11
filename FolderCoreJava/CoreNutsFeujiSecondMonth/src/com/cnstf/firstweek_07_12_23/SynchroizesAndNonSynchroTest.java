package com.cnstf.firstweek_07_12_23;

//6. Write a program to show the behavior of synchronized function and non-synchronized function.

public class SynchroizesAndNonSynchroTest {

	public static void main(String[] args) {
//		System.out.println("out put for synchro");
//
//		ClassForSynchro syncro = new ClassForSynchro();
//		Thread t1 = new Thread(syncro);
//		Thread t2 = new Thread(syncro);
//		t1.start();
//		t2.start();

		System.out.println("out put for non synchro");

		ClassForNonSynchro nonsyncro = new ClassForNonSynchro();
		Thread t3 = new Thread(nonsyncro);
		Thread t4 = new Thread(nonsyncro);
		t3.start();
		t4.start();

	}

}

class ClassForSynchro implements Runnable

{

	@Override
	public synchronized void run() {
		for (int i = 0; i <= 3; i++)
			System.out.println(Thread.currentThread().getName() + "synchro");

	}

}

class ClassForNonSynchro implements Runnable

{

	@Override
	public void run() {
		for (int i = 0; i <= 3; i++)
			System.out.println(Thread.currentThread().getName()+"non synchro");

	}

}
