package com.cnstf.firstweek_07_12_23;
//4. show the behavior of thread by influencing thread functions (sleep, join, yield)
public class ThreadInfluence implements Runnable{
	public static void main(String[] args) throws InterruptedException {
		ThreadInfluence thrd=new ThreadInfluence();
		Thread thrd1=new Thread(thrd);
		Thread thrd2=new Thread(thrd);
		thrd1.start();
		//thrd1.join();
		//Thread.sleep(1000);
		//Thread.yield();
		thrd2.start();
		
	}

	@Override
	public void run() {
		for(int i=0;i<=4;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ---> "+i);
			
		}
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	
//		for(int i=0;i<=4;i++)
//		{
//			System.out.println(Thread.currentThread().getName()+" ---> "+i);
//			
//		}
//	
		
		
	}

}
