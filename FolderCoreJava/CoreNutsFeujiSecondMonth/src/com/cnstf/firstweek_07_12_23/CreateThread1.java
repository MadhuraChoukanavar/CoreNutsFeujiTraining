package com.cnstf.firstweek_07_12_23;
//2. Write a program to create thread using thread class and Runnable interface.
public class CreateThread1 implements Runnable{
	public static void main(String[] args) {
		CreateThread1 createThread1=new CreateThread1();
		Thread thread1=new Thread( createThread1);
		thread1.start();
		Thread thread2=new Thread(createThread1);
		thread2.start();
		
		
	}

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}

}
