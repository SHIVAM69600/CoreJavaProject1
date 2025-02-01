package com.Exception;

public class Student {
	 int age; 
	  public Student(int age) {
	        this.age = age;
	    }
	public void GetAge() throws InvelidAgeException{
		if(age<18) {
			throw new InvelidAgeException("not allowed");
		}else {
				System.out.println("valid")	;	
		}
	}
	public void calculateLoan() throws InvelidLoanArgException{
		System.out.println("hello1");
		int i=2/0;
		if(true) 
			throw new InvelidLoanArgException("not allowed");
		else 
         System.out.println("hello");
	}
	
	
	
}

