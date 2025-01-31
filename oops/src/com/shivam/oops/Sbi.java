package com.shivam.oops;

public class Sbi  extends Rbi{
	
	@Override
	public void createAccount(String name, double Deposit) {
	        this.accountHolder = name;
	        this.balance = Deposit;
	        System.out.println(" Sbi ACCOUND " +" "+ name);
	    }

	

	@Override
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("deposit balence"  +" "+ amount);		
		
	}

	
}
