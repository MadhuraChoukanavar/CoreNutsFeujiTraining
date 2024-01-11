package com.cnstf.thirdweek20_11_23;

public interface Banking {
	
	
	public abstract void checkingBalance() ; 
	public abstract void transaction() throws InsaficientBalanceException;
	public abstract void displayBalance();
	
	

}
