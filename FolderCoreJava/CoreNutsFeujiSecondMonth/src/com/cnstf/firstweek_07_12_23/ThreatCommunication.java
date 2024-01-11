package com.cnstf.firstweek_07_12_23;
//7. Write a program to show the thread communication from one thread to another thread.
public class ThreatCommunication implements Runnable {
	public static void main(String[] args) throws InterruptedException {
		ThreatCommunication thrd=new ThreatCommunication();
		Thread t1=new Thread( thrd);
		//Thread t2=new Thread( thrd);
		Thread t3=new Thread( thrd);
		t1.start();
		t1.wait(100);
		thrd.run2();
		t3.start();
		
		
	}

	@Override
	public  void run() {
		
		for(int  i=0;i<=4;i++)
		{
			System.out.println(i);
		}
		
	
	}
	public synchronized void run2()
	{
		
		 
		for(int i=0;i<3;i++)
		System.out.println("hi");
		notify();
		
	}

}
