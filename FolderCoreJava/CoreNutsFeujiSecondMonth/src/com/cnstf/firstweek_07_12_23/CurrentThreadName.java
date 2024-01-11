package com.cnstf.firstweek_07_12_23;

public class CurrentThreadName  implements Runnable{
	public static void main(String[] args) {
		CurrentThreadName current=new CurrentThreadName();
		Thread thr1=new Thread(current);
		Thread thr2=new Thread(current);
		thr1.start();
		thr2.start();
		
	}

	@Override
	public void run() {
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
			
		}
		System.out.println(Thread.currentThread().getName());
	}

}
