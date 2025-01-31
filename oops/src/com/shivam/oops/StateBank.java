package com.shivam.oops;

public class StateBank  extends Rbi{

	@Override
	public void createAccount(String name, double Deposite) {
		this.accountHolder=name;
		this.balance=Deposite;
		System.out.println("State bank"+ " "+ name);
	}

	@Override
	public void deposit(double amount) {
		this.balance=amount;
		System.out.println("Deposite "+" "+amount);
		
	}

}
