package com.shivam.oops;

public class Hdfc extends Rbi{
	  @Override
	    public void createAccount(String name, double Deposit) {
	        this.accountHolder = name;
	        this.balance = Deposit;
	        System.out.println(" HDFS ACCOUND " + name);
	    }

	   @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("deposit balence" + amount );
	    }
}
