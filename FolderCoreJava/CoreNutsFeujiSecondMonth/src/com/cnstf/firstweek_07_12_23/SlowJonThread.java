package com.cnstf.firstweek_07_12_23;
//5. Write a program to display 1 to 100 values while executing thread job in slow face.
public class SlowJonThread extends Thread{
	public static void main(String[] args)  {
		SlowJonThread sj=new SlowJonThread();
		sj.start();
		
		
	}
	public void run() {
		for(int i=1;i<=100;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(i);	
		}

	}
}
