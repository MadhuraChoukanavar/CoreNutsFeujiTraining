package com.cnstf.firstweek_07_12_23;

public class TotalTicketPriceTest {
	public static void main(String[] args) throws InterruptedException {
		TotalticketPrice tp=new TotalticketPrice();
		tp.start();
		//System.out.println("total amount  =  "+tp.total);
		synchronized (tp) {
			tp.wait();
		}
		System.out.println("total amount  =  "+tp.total);
	}

}
 class TotalticketPrice extends Thread {
	
	int total;
	
	@Override
	public void run() {
		synchronized (this) {
			
	
		for(int i=1;i<=10;i++)
		{
			total=total+100;
			System.out.println(total);
		}
		this.notify();
		}
	}

	
	

}