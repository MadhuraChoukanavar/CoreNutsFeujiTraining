package com.cnstf.firstweek_07_12_23;

public class Banking extends Thread{
	public static void main(String[] args) {
		Transaction c=new Transaction();    
		new Thread(){    
		public void run(){c.withdraw(15000);}    
		}.start();    
		new Thread(){    
		public void run(){c.deposit(10000);}    
		}.start();  
	}
	
	

}
class Transaction
{
	
	int amount=10000;
	public synchronized void withdraw(int withDrawAmount)
	{
		if(this.amount<withDrawAmount)
		{
			
			Thread.yield();
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
			amount=amount-withDrawAmount;
			System.out.println("your balance after withdraw = "+amount);
		
	}
	public synchronized void deposit(int depositAmount)
	{
		amount=amount+depositAmount;
		
		System.out.println("your balance after deposit = "+amount);
		notify();
	}
	
	
	
	}