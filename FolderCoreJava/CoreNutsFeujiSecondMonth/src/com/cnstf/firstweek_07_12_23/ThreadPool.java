package com.cnstf.firstweek_07_12_23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		executorService.execute(new ExecuteSer());
		executorService.execute(new ExecuteSer());
		executorService.execute(new ExecuteSer());
		executorService.execute(new ExecuteSer());
		executorService.execute(new ExecuteSer());
		
		
	}
}
class ExecuteSer extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=4;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
		}
		System.out.println("done....");
	}
	
	
	}
