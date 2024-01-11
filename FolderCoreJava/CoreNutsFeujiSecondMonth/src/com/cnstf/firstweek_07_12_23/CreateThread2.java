package com.cnstf.firstweek_07_12_23;
//2. Write a program to create thread using thread class and Runnable interface.
public class CreateThread2 extends Thread {
	public static void main(String[] args) {
		CreateThread2 createThread1=new CreateThread2();
		CreateThread2 createThread2=new CreateThread2();
		createThread1.start();
		createThread2.start();
		
	}
	@Override
	public void run() {
	for(int i=0;i<10;i++)
	
	{
		System.out.println(i);
	}
	}
}
