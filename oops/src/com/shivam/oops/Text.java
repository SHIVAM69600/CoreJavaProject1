package com.shivam.oops;

public class Text {
	public static void main(String []args) {
	 Sbi sbi = new Sbi();
     sbi.createAccount("shivam", 5000);
     sbi.deposit(2000);
     Hdfc hdfc=new Hdfc();
     hdfc.createAccount("harshit",600);
     hdfc.deposit(3000);
     StateBank st= new StateBank();
     st.createAccount("dolly",600);
     st.deposit(400);
}
}